public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        image.display();
        image.display(); // second time should not load again
    }
}