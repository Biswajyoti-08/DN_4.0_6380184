public class Main {
    public static void main(String[] args) {
        Stock market=new StockMarket();
        Observer obj=new MobileApp();
        Observer obj2=new WebApp();
        market.register(obj);
        market.register(obj2);
        market.notifyObserver();
    }
}
