public class Quackologist implements Observer {
    public void update(QuackOberverable duck){
        System.out.println("Quackologist: "+duck+" just quacked");
    }
}
