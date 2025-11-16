package com.example.loose;

import org.springframework.stereotype.Component;

@Component
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String meesage) {
        System.out.println("SMS : "+ meesage);
    }
}
