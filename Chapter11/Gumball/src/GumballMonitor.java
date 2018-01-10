import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machineRemote;

    public GumballMonitor(GumballMachineRemote machineRemote){
        this.machineRemote = machineRemote;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + machineRemote.getLocation());
            System.out.println("Current inventory: " + machineRemote.getCount() + " gumballs");
            System.out.println("Current state: " + machineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
