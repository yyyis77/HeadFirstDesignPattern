/**
 * Created by yangyongyi on 12/27/17.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println(" I'm a real mallard duck ");
    }
}
