public class NotifierDecorator implements Notifier {
    protected Notifier text;

    public NotifierDecorator(Notifier text) {
        this.text = text;
    }
    @Override
     public void send() {
         text.send();
    }
}
