/**
 * Created by yangyongyi on 1/1/18.
 */
public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (item.equals("clam")){
            return new NYStyleClamPizza();
        }else if (item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
