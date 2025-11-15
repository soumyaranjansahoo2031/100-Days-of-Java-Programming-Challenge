package com.example.loose;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String meesage) {
        System.out.println("Email : "+ meesage);
    }
}
