package com.example.demo;

import com.example.loose.NotificationService;

public class LifeCycleBean {
    private NotificationService notificationService;

    public LifeCycleBean(NotificationService notificationService){
        System.out.println("Constructor called: Dependency Injected");
        this.notificationService=notificationService;
    }
    public void init(){
        System.out.println("init called: Bean initialized");
        notificationService.send("Hello from init()");
    }
    public void performTask(){
        System.out.println("Ready for use!");
    }
    public void cleanup(){
        System.out.println("cleanup() being called");
    }
}