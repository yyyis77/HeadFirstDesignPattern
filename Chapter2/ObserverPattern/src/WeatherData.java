import java.util.ArrayList;

/**
 * Created by yangyongyi on 12/28/17.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void deleteObserver(Observer o){
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }
    public void notifyObservers(){
        for (int i=0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void messurementsChanged(){
        notifyObservers();
    }
    public void setMessurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChanged();
    }
}
