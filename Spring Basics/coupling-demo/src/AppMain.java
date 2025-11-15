import loose.EmailNotificationService;
import loose.NotificationService;
import loose.SMSNotificationService;
import tight.UserService;

public class AppMain {
    static void main(String[] args) {

        //tight coupling
        UserService userService = new UserService();
        userService.notifyUser("I am the Master");

        //loose coupling
        NotificationService emailService = new EmailNotificationService();
        loose.UserService userService1 = new loose.UserService(emailService);
        // emsilService is an implementation of notification service
        userService1.notifyUser("Believe in yourself");

        NotificationService smsService = new SMSNotificationService();
        loose.UserService userService2 = new loose.UserService(smsService);
        userService2.notifyUser("Believe in the universe");

        /*
        Constructor Injection
        Setter Injection
        Field Injection
         */
    }
}