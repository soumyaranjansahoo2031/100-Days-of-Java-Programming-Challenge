package com.example.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class HelloController {

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/greet")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/admin/greet")
    public String sayAdminHello(){
        return "Hello";
    }
    @GetMapping("/user/greet")
    public String sayUserHello(){
        return "Hello";
    }
}
