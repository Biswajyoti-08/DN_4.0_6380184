public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypal = new PayPalPayment("conizant@example.com");

        context.setPaymentStrategy(creditCard);
        context.payAmount(1500.00);

        context.setPaymentStrategy(paypal);
        context.payAmount(2500.00);
    }
}
