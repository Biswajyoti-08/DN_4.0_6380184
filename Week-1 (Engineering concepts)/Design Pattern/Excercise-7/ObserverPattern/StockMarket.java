import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    List<Observer> observer=new ArrayList<>();

    @Override
    public void deregister(Observer obj) {
        // TODO Auto-generated method stub
     this.observer.remove(obj);
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
       for(Observer i :this.observer){
        i.update();
       }
    }

    @Override
    public void register(Observer obj) {
        // TODO Auto-generated method stub
            this.observer.add(obj);
    }
    
}
