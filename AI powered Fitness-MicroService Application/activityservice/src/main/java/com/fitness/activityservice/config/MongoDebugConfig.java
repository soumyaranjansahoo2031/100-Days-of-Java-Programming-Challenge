//package com.fitness.activityservice.config;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MongoDebugConfig {
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    @PostConstruct
//    public void printDatabaseName() {
//        System.out.println("🔥 CONNECTED MONGO DATABASE = "
//                + mongoTemplate.getDb().getName());
//    }
//}
