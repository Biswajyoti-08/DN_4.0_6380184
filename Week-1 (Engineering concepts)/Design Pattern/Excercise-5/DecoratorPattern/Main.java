public class Main {
    public static void main(String[] args) {
        Notifier Emailtext=new EmailNotifier();
        Notifier slacNotifier=new SlackNotifierDecorator(Emailtext);
        slacNotifier.send();
        Notifier smsNotifier=new SMSNotifierDecorator(Emailtext);
        smsNotifier.send();
    }
}
