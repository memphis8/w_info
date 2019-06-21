package Model;

import Model.Weather.CurrentForecast.WeatherInfo;
import Model.Weather.FiveDaysForecast.ForecastWeatherInfo;
import Model.Weather.FiveDaysForecast.JsonParse.DaysWeatherForecast;
import com.google.gson.*;

class ApiResponseParser {
    static WeatherInfo getCurrentWeatherInfo(String response) {

        WeatherInfo weatherInfo = new WeatherInfo();

        JsonElement jelement = new JsonParser().parse(response);
        JsonObject jobject = jelement.getAsJsonObject();

        weatherInfo.setCity(jobject.get("name").getAsString()) ;

        JsonObject cloudsObj = jobject.get("clouds").getAsJsonObject();
        weatherInfo.setClouds(cloudsObj.get("all").getAsInt());

        JsonArray weatherArray = jobject.getAsJsonArray("weather");

        JsonObject weatherObj = weatherArray.get(0).getAsJsonObject();
        weatherInfo.setWeather(weatherObj.get("main").getAsString());

        JsonObject mainObj = jobject.get("main").getAsJsonObject();
        weatherInfo.setHumidity(mainObj.get("humidity").getAsInt());
        weatherInfo.setTemperatureMin(mainObj.get("temp_min").getAsInt());
        weatherInfo.setTemperatureMax(mainObj.get("temp_max").getAsInt());
        weatherInfo.setPressure(mainObj.get("pressure").getAsInt());

        JsonObject windObj = jobject.get("wind").getAsJsonObject();
        weatherInfo.setWindDirection(windDirectionConverter(windObj.get("deg").getAsInt()));
        weatherInfo.setWindSpeed(windObj.get("speed").getAsInt());

        return weatherInfo;
    }

    static ForecastWeatherInfo getForecastWeatherInfo(String response) {
        Gson gson = new Gson();
        DaysWeatherForecast daysWeatherForecast = gson.fromJson(response, DaysWeatherForecast.class);
        ForecastWeatherInfo forecastWeatherInfo = new ForecastWeatherInfo();
        forecastWeatherInfo.castForecastData(daysWeatherForecast);
        return forecastWeatherInfo;
    }

    private static String windDirectionConverter(int degrees) {
        int val = (int) ((degrees / 22.5) + .5);
        String[] windTypes = {"N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"};
        return windTypes[(val % 16)];
    }
}