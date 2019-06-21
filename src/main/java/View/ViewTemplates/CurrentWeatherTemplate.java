package View.ViewTemplates;

import Model.Weather.CurrentForecast.WeatherInfo;


public class CurrentWeatherTemplate {
    public static void showCurrentWeather(WeatherInfo weatherInfo){
        System.out.println("\nCurrent weather for city : "+weatherInfo.getCity());
        System.out.println("\n"+weatherInfo.getWeather());
        System.out.println("From "+(weatherInfo.getTemperatureMin())+"°C to "+(weatherInfo.getTemperatureMax())+"°C");
        System.out.println("Wind - "+weatherInfo.getWindSpeed()+" km/h "+weatherInfo.getWindDirection());
        System.out.println("Clouds - "+weatherInfo.getClouds()+"%");
        System.out.println("Humidity - "+weatherInfo.getHumidity()+"%");
        System.out.println("Pressure - "+weatherInfo.getPressure()+" hpa");
    }
}
