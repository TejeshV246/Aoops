public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MyApplication app1 = new MyApplication(emailService);
        MyApplication app2 = new MyApplication(smsService);

        app1.notifyUser("Hello, Email User!", "user@example.com");
        app2.notifyUser("Hello, SMS User!", "123-456-7890");
    }
}
