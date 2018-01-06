/**
 * Created by yangyongyi on 1/1/18.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item){
        if (item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if (item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
