/**
 * Created by yangyongyi on 12/28/17.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);

        weatherData.setMessurements(80, 65, 30.4f);
        weatherData.setMessurements(82, 70, 30.9f);
        weatherData.setMessurements(71, 90, 26f);
    }
}
