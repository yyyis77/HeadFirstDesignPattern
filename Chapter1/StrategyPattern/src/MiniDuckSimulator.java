/**
 * Created by yangyongyi on 12/27/17.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        System.out.println("Test mallard duck: ");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        System.out.println("Test model duck: ");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
