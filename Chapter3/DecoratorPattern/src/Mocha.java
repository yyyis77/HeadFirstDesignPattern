/**
 * Created by yangyongyi on 12/29/17.
 */
public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    public double cost(){
        return 0.20+beverage.cost();
    }

}
