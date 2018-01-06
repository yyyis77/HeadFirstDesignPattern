/**
 * Created by yangyongyi on 12/30/17.
 */
public class SimplePizzaFacroty {
    public Pizza createPizza(String type){
        Pizza pizza = new Pizza();

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
