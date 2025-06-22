public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(150.0);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(250.0);
    }
}