import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args){
        new MyClient().go();
    }

    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String val = service.sayHello();
            System.out.println(val);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
