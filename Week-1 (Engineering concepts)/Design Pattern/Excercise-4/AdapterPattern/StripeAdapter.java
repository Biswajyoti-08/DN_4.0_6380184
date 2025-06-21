public class StripeAdapter implements PaymentProcessor {
    private final StripePaymentGateway stripe;

    public StripeAdapter(StripePaymentGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makeStripePayment(amount);
    }
}