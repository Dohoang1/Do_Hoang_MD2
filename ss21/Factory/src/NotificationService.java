import java.util.Scanner;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter way to send notification: ");

        Notification notification = notificationFactory.createNotification(scanner.nextLine());
        notification.notifyUser();

    }
}
