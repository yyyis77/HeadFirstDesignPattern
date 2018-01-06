/**
 * Created by yangyongyi on 1/2/18.
 */
public class myClass {
    private volatile static myClass singleton;

    private myClass(){ };

    public static myClass getInstance(){
        if(singleton == null){
            synchronized (myClass.class) {
                if (singleton == null) {
                    singleton = new myClass();
                }
            }
        }
        return singleton;
    }
}
