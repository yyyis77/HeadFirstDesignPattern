/**
 * Created by yangyongyi on 1/4/18.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
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
