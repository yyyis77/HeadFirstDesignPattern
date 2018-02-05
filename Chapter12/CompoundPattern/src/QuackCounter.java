public class QuackCounter implements Quackable {
    Quackable duck;
    static int count;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    public void registerObserver(Observer observer){
        duck.registerObserver(observer);
    }

    public void notifyObserver() {
        duck.notifyObserver();
    }

    public void quack(){
        duck.quack();
        count++;
    }

    public static int getQuacks(){
        return count;
    }
}
