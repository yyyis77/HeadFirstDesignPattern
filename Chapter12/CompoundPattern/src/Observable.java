import java.util.ArrayList;
import java.util.Iterator;

public class Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    QuackOberverable duck;

    public Observable(QuackOberverable duck){
        this.duck = duck;
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
