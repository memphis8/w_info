package Model.Weather.FiveDaysForecast;

import java.util.ArrayList;

public class DailyForecast {
    String date;
    ArrayList<HourlyForecast> hourlyForecasts = new ArrayList<HourlyForecast>();

    public String getDate() {
        return date;
    }

    public ArrayList<HourlyForecast> getHourlyForecasts() {
        return hourlyForecasts;
    }
}
