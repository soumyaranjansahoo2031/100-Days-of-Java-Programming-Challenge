public class UserService {
    NotificationService notificationService = new NotificationService();
    public void notifyUser(String meesage){
        notificationService.send(meesage);
    }
}
