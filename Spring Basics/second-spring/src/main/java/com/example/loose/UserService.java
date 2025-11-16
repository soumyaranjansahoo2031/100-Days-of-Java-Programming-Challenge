package com.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UserServiceEmail")
public class UserService {
//    public UserService() {
//    }
//    @Autowired
    NotificationService notificationService;

    @Autowired
//    @Qualifier("emailNotificationService")    // -> written with argument
    public UserService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    // this is recommended


    public void notifyUser(String meesage){
        notificationService.send(meesage);
    }

//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
}
