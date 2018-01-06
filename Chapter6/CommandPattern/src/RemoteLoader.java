/**
 * Created by yangyongyi on 1/4/18.
 */
public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light bedRoomLight = new Light("Bed Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
/*
        LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand bedRoomOnCommand = new LightOnCommand(bedRoomLight);
        LightOffCommand bedRoomOffCommand = new LightOffCommand(bedRoomLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,livingRoomOnCommand,livingRoomOffCommand);
        remoteControl.setCommand(1,bedRoomOnCommand,bedRoomOffCommand);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(0);
        remoteControl.pressUndoButton();
*/
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        System.out.println(remoteControl);
        remoteControl.pressUndoButton();

        remoteControl.pressOnButton(1);
        System.out.println(remoteControl);
        remoteControl.pressUndoButton();
    }
}
