import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew(){
        System.out.println("Dripping coffee through filter");
    }
    public void addCondiments(){
        System.out.println("Adding sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else
            return false;
    }

    public String getUserInput(){
        String answer = null;
        System.out.println("Would you want milk and sugar with your coffee (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException io){
            System.err.println("IO ERROR");
        }

        if (answer == null) return "no";

        return answer;
    }
}
