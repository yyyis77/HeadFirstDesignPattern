public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }

    public void notifyObserver() {
        observable.notifyObserver();
    }

    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    public void quack(){
        goose.honk();
        notifyObserver();
    }
}
