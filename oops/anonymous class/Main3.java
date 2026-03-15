
class NotificationService {
    void send(String message) {
        System.out.println("Standard Notification: " + message);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // 1. Regular usage
        NotificationService normalService = new NotificationService();
        normalService.send("Your appointment is confirmed.");

        // 2. The "Third Way": Overriding the concrete class anonymously
        // We are changing the logic ONLY for this 'urgentService' object
        NotificationService urgentService = new NotificationService() {
            @Override
            void send(String message) {
                System.out.println("!!! URGENT ALERT !!!: " + message);
            }
        };

        urgentService.send("The doctor is running 30 minutes late!");
    }
}