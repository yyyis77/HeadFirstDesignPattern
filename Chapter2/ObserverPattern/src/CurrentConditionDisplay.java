/**
 * Created by yangyongyi on 12/28/17.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature +
                "F degree and " + humidity + "% humidity");
    }
}
