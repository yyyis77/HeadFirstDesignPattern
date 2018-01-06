/**
 * Created by yangyongyi on 12/31/17.
 */
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25min at 350 degrees");
    }

    public void cut(){
        System.out.println("Cut into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in a official PizzaStore box");
    }

    public String getName(){
        return name;
    }

}
