/**
 * Created by yangyongyi on 1/3/18.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo(){ light.off(); }
}
