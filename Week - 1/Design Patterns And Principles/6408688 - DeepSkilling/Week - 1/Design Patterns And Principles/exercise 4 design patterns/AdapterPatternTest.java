public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter(new PayPalGateway());
        processor.processPayment(250.0);
    }
}