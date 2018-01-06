/**
 * Created by yangyongyi on 12/30/17.
 */
public class PizzaStore {
    SimplePizzaFacroty simplePizzaFacroty;

    public PizzaStore(SimplePizzaFacroty simplePizzaFacroty){
        this.simplePizzaFacroty = simplePizzaFacroty;
    }

    public Pizza OrderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFacroty.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
