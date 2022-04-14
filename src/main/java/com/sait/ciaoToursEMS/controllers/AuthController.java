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

/**
 * AuthController
 *
 * Handles all user login and signup requests
 */
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

    /**
     * Sign in requests.
     * @param loginRequest A login request object with username and password
     * @return A JWT token
     */
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
        return ResponseEntity.ok().headers(headers)
                .body(new UserInfoResponse(userDetails.getUserID(),
                        userDetails.getUsername(),
                        userDetails.getEmployeeID(),
                        roles, jwtCookie.toString()));
    }

    /**
     * Get user object by employee id
     * @param id Employee id
     * @return User object
     */
    @GetMapping("/user-by-employee-id/{id}")
    public List<User> getUserByEmployeeId(@PathVariable Long id){
        return userRepository.findByEmployeeID(id);
    }

    /**
     * Reset password
     * @param id User id of the user to reset password
     * @param userDetails User details object
     * @return User object with new password
     */
    @PutMapping("/reset-password/{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable Long id, @RequestBody User userDetails){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No user found with this id :" + id));

        user.setPassword(passwordEncoder.encode(userDetails.getPassword()));

        User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    /**
     * Sign up requests.
     * @param signUpRequest A signup request object with username and password
     * @return A JWT token
     */
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

    /**
     * Sign out request that removes the JWT token from the user's browser
     * @return A message response with reset cookie
     */
    @PostMapping("/signout")
    public ResponseEntity<?> logoutUser() {
        ResponseCookie cookie = jwtUtils.getCleanJwtCookie();

        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
                .body(new MessageResponse("You've been signed out!"));
    }
}
