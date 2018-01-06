/**
 * Created by yangyongyi on 1/4/18.
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        prevSpeed = ceilingFan.getSpeed();
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    public void undo(){
        ceilingFan.undo(prevSpeed);
    }
}
