/**
 * Created by yangyongyi on 12/30/17.
 */
public abstract class Pizza {
    String name;

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
    }
    public void bake(){
        System.out.println("Baking " + name);
    }
    public void cut(){
        System.out.println("Cutting " + name);
    }
    public void box(){
        System.out.println("Boxing " + name);
    }
}
