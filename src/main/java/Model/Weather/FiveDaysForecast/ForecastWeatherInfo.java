package Model.Weather.FiveDaysForecast;

import Model.Weather.FiveDaysForecast.JsonParse.DaysWeatherForecast;
import Model.Weather.FiveDaysForecast.JsonParse.List;
import Model.Weather.FiveDaysForecast.JsonParse.Wind;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class ForecastWeatherInfo {
    private String city;
    private String country;
    private ArrayList<DailyForecast> dailyForecasts = new ArrayList<>();

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }


    private int dayNumber = 0;

    public void castForecastData(DaysWeatherForecast daysWeatherForecast) {
        this.city = daysWeatherForecast.getCity().getName();
        this.country = daysWeatherForecast.getCity().getCountry();

        for (int i = 0; i < 5; i++) {
            DailyForecast dailyForecast = new DailyForecast();
            this.dailyForecasts.add(dailyForecast);
        }



        for (int i = 0; i < daysWeatherForecast.getList().size(); i += 2) {
            HourlyForecast hourlyForecast = new HourlyForecast();
            List currentList = daysWeatherForecast.getList().get(i);
            hourlyForecast.windDirection = Wind.windDirectionConverter(currentList.getWind().getDeg());
            hourlyForecast.temperature = currentList.getMain().getTemp();
            hourlyForecast.weather = currentList.getWeather().get(0).getMain();
            hourlyForecast.pressure = currentList.getMain().getPressure();
            hourlyForecast.windSpeed = currentList.getWind().getSpeed();
            hourlyForecast.humidity = currentList.getMain().getHumidity();
            hourlyForecast.clouds = currentList.getClouds().getAll();

            switch (i) {
                case 0:
                    hourlyForecast.timeOfDay = "Night";
                    dailyForecasts.get(dayNumber).date = castToProperDate(getDate());
                    break;
                case 8:
                case 16:
                case 24:
                case 32:
                    hourlyForecast.timeOfDay = "Night";
                    dayNumber++;
                    dailyForecasts.get(dayNumber).date = castToProperDate(addDayToDate(dayNumber,getDate()));
                    break;
                case 2:
                case 10:
                case 18:
                case 26:
                case 34:
                    hourlyForecast.timeOfDay = "Morning";
                    break;
                case 4:
                case 12:
                case 20:
                case 28:
                case 36:
                    hourlyForecast.timeOfDay = "Noon";
                    break;
                case 6:
                case 14:
                case 22:
                case 30:
                case 38:
                    hourlyForecast.timeOfDay = "Evening";
                    break;
            }

            dailyForecasts.get(dayNumber).hourlyForecasts.add(hourlyForecast);
        }
    }

    private static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd MM");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    private static String addDayToDate(int days,String oldDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM");
        Calendar c = Calendar.getInstance();
        try{
            c.setTime(sdf.parse(oldDate));
        }catch(ParseException e){
            e.printStackTrace();
        }
        c.add(Calendar.DAY_OF_MONTH, days);
        return sdf.format(c.getTime());
    }

    private static String castToProperDate(String date){
        String day = date.substring(0,2);
        int month = Integer.parseInt(date.substring(3));
        String monthString = new DateFormatSymbols().getMonths()[month-1];
        return day+" "+monthString;
    }

}
