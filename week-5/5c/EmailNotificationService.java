public class EmailNotificationService implements NotificationService {
    @Override
    public void notify(Member member, String message) {
        System.out.println("Sending email to " + member.getEmail() + ": " + message);
    }
}
