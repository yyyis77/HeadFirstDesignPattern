import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by yangyongyi on 12/28/17.
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){ }

    public void messurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMessurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChanged();
    }

    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return  humidity;
    }
    public float getPressure(){
        return pressure;
    }
}
