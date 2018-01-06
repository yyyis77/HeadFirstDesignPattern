/**
 * Created by yangyongyi on 1/4/18.
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        prevSpeed = ceilingFan.getSpeed();
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo(){
        ceilingFan.undo(prevSpeed);
    }
}
