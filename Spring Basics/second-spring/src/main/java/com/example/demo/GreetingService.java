package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingService {
    public static void sayHello() {
        System.out.println("Hello from spring");
    }
}
