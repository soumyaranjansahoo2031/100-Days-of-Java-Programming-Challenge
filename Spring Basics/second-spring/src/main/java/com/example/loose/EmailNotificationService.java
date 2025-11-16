package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String meesage) {
        System.out.println("Email : "+ meesage);
    }
}
