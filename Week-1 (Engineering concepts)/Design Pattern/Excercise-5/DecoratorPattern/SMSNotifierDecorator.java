public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier text) {
        super(text);
    }

    @Override
    public void send() {
        super.send();              
        sendSMSNotification();     
    }

    private void sendSMSNotification() {
        System.out.println("SMS Notifier sends a notification");
    }
}
