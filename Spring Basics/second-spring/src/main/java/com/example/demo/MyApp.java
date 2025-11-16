package com.example.demo;


import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService greetingService =
                (GreetingService) context.getBean("myBean");
        greetingService.sayHello();

        UserService userService =
                (UserService) context.getBean("UserServiceEmail");
        userService.notifyUser("what's up?");
//
//        UserService userService2 =
//                (UserService) context.getBean("UserServiceSMS");
//        userService2.notifyUser("what's up?");
    }
}
