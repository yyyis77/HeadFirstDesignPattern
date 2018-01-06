/**
 * Created by yangyongyi on 1/4/18.
 */
public class Light {
    String loc = "";

    public Light(String loc){
        this.loc = loc;
    }

    public void on(){
        System.out.println(loc + "light is on");
    }
    public void off(){
        System.out.println(loc + "light is off");
    }
}
