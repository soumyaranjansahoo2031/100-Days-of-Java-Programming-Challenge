package com.example.loose;

public class UserService {
    public UserService() {
    }

    NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void notifyUser(String meesage){
        notificationService.send(meesage);
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
