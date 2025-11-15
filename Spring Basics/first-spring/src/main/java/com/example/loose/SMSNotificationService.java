package com.example.loose;

public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String meesage) {
        System.out.println("SMS : "+ meesage);
    }
}
