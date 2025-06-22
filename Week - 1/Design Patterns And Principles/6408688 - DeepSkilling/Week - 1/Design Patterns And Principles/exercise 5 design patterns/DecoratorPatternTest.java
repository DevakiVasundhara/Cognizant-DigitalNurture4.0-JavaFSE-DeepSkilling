public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new EmailNotifier());
        notifier.send("System update at 5 PM.");
    }
}