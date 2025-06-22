public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket();
        Observer mobileApp = new MobileApp();
        stock.registerObserver(mobileApp);
        stock.setPrice(500.0f);
    }
}