public class PayPalAdapter implements PaymentProcessor {
    private final PayPalPaymentGateway paypal;

    public PayPalAdapter(PayPalPaymentGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
