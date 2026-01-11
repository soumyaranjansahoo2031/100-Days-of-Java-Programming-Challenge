package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.Authenticator;

@RestController
@EnableMethodSecurity
public class HelloController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/greet")
    public String sayHello(){
        return "Hello . And you are ?";
    }
    @GetMapping("/admin/greet")
    public String sayAdminHello(){
        return "Hello Admin";
    }
    @GetMapping("/user/greet")
    public String sayUserHello(){
        return "Hello USER";
    }

    @PostMapping("/signin")
    public String login(@RequestBody LoginRequest loginRequest){
        Authentication authentication;
        try{
            authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )

            );
        } catch (Exception e) {
            e.printStackTrace();
            return "can not be authenticated";
        }
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);
        return jwtToken;
    }
}
