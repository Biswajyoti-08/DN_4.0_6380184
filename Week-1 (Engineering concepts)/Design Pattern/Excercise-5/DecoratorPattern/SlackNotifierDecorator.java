public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier text) {
        super(text);
    }

    @Override
    public void send() {
        super.send();               // Call the wrapped notifier's send method
        sendSMSNotification();      // Add SMS-specific behaviour
    }

    private void sendSMSNotification() {
        System.out.println("SMS Notifier sends a notification");
    }
}
