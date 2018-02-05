import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void registerObserver(Observer observer){
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    public void notifyObserver() { }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
