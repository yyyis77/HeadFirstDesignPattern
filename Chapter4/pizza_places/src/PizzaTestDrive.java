/**
 * Created by yangyongyi on 1/1/18.
 */
public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = chicagoStore.OrderPizza("cheese");
        System.out.println("Ordered a "+pizza.getName());

        pizza = nyStore.OrderPizza("clam");
        System.out.println("Ordered a "+pizza.getName());
    }
}
