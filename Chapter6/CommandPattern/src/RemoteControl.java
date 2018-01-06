/**
 * Created by yangyongyi on 1/4/18.
 */

// this is the invoker
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommand = new noCommand();

        for (int i=0; i<7; i++){
            onCommands[i] = new noCommand();
            offCommands[i] = new noCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void pressOnButton(int index){
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }
    public void pressOffButton(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void pressUndoButton(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
