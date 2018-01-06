/**
 * Created by yangyongyi on 12/29/17.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
