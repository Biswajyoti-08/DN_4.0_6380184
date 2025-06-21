public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePaymentGateway());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPaymentGateway());

        System.out.println("Processing Payments:");
        stripeProcessor.processPayment(1500.00);
        paypalProcessor.processPayment(3200.50);
    }
}
