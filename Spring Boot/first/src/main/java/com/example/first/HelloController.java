package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Mr.Curious";
    }
//    @GetMapping("/user")
    @GetMapping(value = "/user", produces = "application/json")
    public User getUser(){
        return new User(1,"SRS","srs@gmail.com");
    }

}
