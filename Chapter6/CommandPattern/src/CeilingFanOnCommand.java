/**
 * Created by yangyongyi on 1/4/18.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        prevSpeed = ceilingFan.getSpeed();
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo(){
        ceilingFan.undo(prevSpeed);
    }
}
