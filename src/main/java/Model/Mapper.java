package Model;

import Model.Weather.CurrentForecast.WeatherInfo;
import Model.Weather.FiveDaysForecast.ForecastWeatherInfo;
import Model.Weather.FiveDaysForecast.JsonParse.DaysWeatherForecast;
import View.ViewTemplates.CurrentWeatherTemplate;
import View.ViewTemplates.FutureWeatherTemplate;

class Mapper {
    static void showWeather(WeatherInfo weatherInfo) {
        CurrentWeatherTemplate.showCurrentWeather(weatherInfo);
    }

    static void showWeather(ForecastWeatherInfo forecastWeatherInfo) {
        FutureWeatherTemplate.showFutureWeather(forecastWeatherInfo);
    }
}
