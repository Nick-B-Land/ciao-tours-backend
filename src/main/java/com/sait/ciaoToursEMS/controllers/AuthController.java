package com.sait.ciaoToursEMS.controllers;


import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.EnumRoles;
import com.sait.ciaoToursEMS.model.Role;
import com.sait.ciaoToursEMS.model.User;
import com.sait.ciaoToursEMS.payload.request.LoginRequest;
import com.sait.ciaoToursEMS.payload.request.SignupRequest;
import com.sait.ciaoToursEMS.payload.response.MessageResponse;
import com.sait.ciaoToursEMS.payload.response.UserInfoResponse;
import com.sait.ciaoToursEMS.repositorys.RoleRepository;
import com.sait.ciaoToursEMS.repositorys.UserRepository;
import com.sait.ciaoToursEMS.security.jwt.JwtUtils;
import com.sait.ciaoToursEMS.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);

        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        HttpHeaders headers = new HttpHeaders();
        headers.add("set-cookie", jwtCookie.toString());
        //headers.add("Access-Control-Allow-Credentials", "true");
        return ResponseEntity.ok().headers(headers)
                .body(new UserInfoResponse(userDetails.getUserID(),
                        userDetails.getUsername(),
                        userDetails.getEmployeeID(),
                        roles, jwtCookie.toString()));
//        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
//                .body(new UserInfoResponse(userDetails.getUserID(),
//                        userDetails.getUsername(),
//                        userDetails.getEmployeeID(),
//                        roles, jwtCookie.toString()));
    }

    @GetMapping("/user-by-employee-id/{id}")
    public ResponseEntity<User> getUserByEmployeeId(@PathVariable Long id){
        User user = (User) userRepository.findByEmployeeID(id);

        return ResponseEntity.ok(user);
    }

    @PutMapping("/reset-password/{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable Long id, @RequestBody User userDetails){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No user found with this id :" + id));

        User updatedUser = userRepository.save(userDetails);
        return ResponseEntity.ok(updatedUser);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {

        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
        }

        // Create new user's account
        User user = new User(signUpRequest.getUsername(),
                passwordEncoder.encode(signUpRequest.getPassword()),
                signUpRequest.getEmployeeID());

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(EnumRoles.ROLE_EMPLOYEE)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        }
        else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        Role adminRole = roleRepository.findByName(EnumRoles.ROLE_ADMIN)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);
                        break;
                    case "bookkeeper":
                        Role bookRole = roleRepository.findByName(EnumRoles.ROLE_BOOKKEEPER)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(bookRole);
                        break;
                    case "hr":
                        Role hrRole = roleRepository.findByName(EnumRoles.ROLE_HR)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(hrRole);
                        break;
                    default:
                        Role employeeRole = roleRepository.findByName(EnumRoles.ROLE_EMPLOYEE)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(employeeRole);
                }
            });
        }

        user.setRoles(roles);
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }

    @PostMapping("/signout")
    public ResponseEntity<?> logoutUser() {
        ResponseCookie cookie = jwtUtils.getCleanJwtCookie();

        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
                .body(new MessageResponse("You've been signed out!"));
    }
}
