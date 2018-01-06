/**
 * Created by yangyongyi on 12/31/17.
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(String item);

    public Pizza OrderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a "+pizza.getName()+"---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
