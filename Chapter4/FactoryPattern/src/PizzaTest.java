/**
 * Created by yangyongyi on 12/30/17.
 */
public class PizzaTest {
    public static void main(String[] args){
        SimplePizzaFacroty facroty = new SimplePizzaFacroty();
        PizzaStore pizzaStore = new PizzaStore(facroty);

        Pizza pizza = pizzaStore.OrderPizza("cheese");
        System.out.println("We ordered a "+pizza.getName()+".");
        System.out.println(pizza);

        pizza = pizzaStore.OrderPizza("clam");
        System.out.println("We ordered a "+pizza.getName()+".");
        System.out.println(pizza);

    }
}
