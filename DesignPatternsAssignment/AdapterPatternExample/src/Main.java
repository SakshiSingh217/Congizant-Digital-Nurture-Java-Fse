public class Main {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(2500);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(4500);
    }
}