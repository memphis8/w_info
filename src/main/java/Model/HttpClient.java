package Model;

import Model.Weather.CurrentForecast.WeatherInfo;
import Model.Weather.FiveDaysForecast.ForecastWeatherInfo;
import Model.Weather.FiveDaysForecast.JsonParse.DaysWeatherForecast;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpClient {

    private static OkHttpClient client = new OkHttpClient();

    public static void getApiWeatherInfo(String city, int forecastType) throws IOException {
        String requestType;
        if (forecastType == 1) requestType = "/data/2.5/weather?q=";
        else requestType = "/data/2.5/forecast?q=";

        String url = "https://api.openweathermap.org" + requestType +
                city + "&appid=b436e1eb3f6c0a4725b29c347319e28c";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String apiResponse = response.body().string();

            if (forecastType == 2) {
                ForecastWeatherInfo forecastWeatherInfo = ApiResponseParser.getForecastWeatherInfo(apiResponse);
                Mapper.showWeather(forecastWeatherInfo);
            } else {
                WeatherInfo weatherInfo = ApiResponseParser.getCurrentWeatherInfo(apiResponse);
                Mapper.showWeather(weatherInfo);
            }

        }
    }


}
