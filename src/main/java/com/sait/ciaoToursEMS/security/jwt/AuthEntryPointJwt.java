package com.sait.ciaoToursEMS.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Authentication entry point for JWT authentication.
 */
@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

    /**
     * Handle the authentication entry point.
     * @param request The request.
     * @param response The response.
     * @param authException The authentication exception.
     * @throws IOException If an error occurs.
     * @throws ServletException If an error occurs.
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {

        logger.error("Unauthorized error: {}", authException.getMessage());
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");

    }
}

//    Use something like this to customize response data for 401 Status
//
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
//            throws IOException, ServletException {
//        logger.error("Unauthorized error: {}", authException.getMessage());
//        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        final Map<String, Object> body = new HashMap<>();
//        body.put("status", HttpServletResponse.SC_UNAUTHORIZED);
//        body.put("error", "Unauthorized");
//        body.put("message", authException.getMessage());
//        body.put("path", request.getServletPath());
//        final ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(response.getOutputStream(), body);
//    }
