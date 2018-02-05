public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall(){
        observable = new Observable(this);
    }

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }

    public void notifyObserver() {
        observable.notifyObserver();
    }
    public void quack(){
        System.out.println("Kwak");
    }
}
