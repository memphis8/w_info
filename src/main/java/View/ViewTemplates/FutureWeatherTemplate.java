package View.ViewTemplates;


import Model.Weather.FiveDaysForecast.DailyForecast;
import Model.Weather.FiveDaysForecast.ForecastWeatherInfo;
import Model.Weather.FiveDaysForecast.HourlyForecast;


public class FutureWeatherTemplate {
    public static void showFutureWeather(ForecastWeatherInfo forecastWeatherInfo){
        System.out.println("\nWeather forecast : "+forecastWeatherInfo.getCity()+" , "+forecastWeatherInfo.getCountry() );
        for (int i = 0; i < forecastWeatherInfo.getDailyForecasts().size(); i++) {
            printOneDayForecast(forecastWeatherInfo.getDailyForecasts().get(i));
        }
       }

    private static void printOneDayForecast(DailyForecast dailyForecast){
        HourlyForecast nightForecast = dailyForecast.getHourlyForecasts().get(0);
        HourlyForecast morningForecast = dailyForecast.getHourlyForecasts().get(1);
        HourlyForecast noonForecast = dailyForecast.getHourlyForecasts().get(2);
        HourlyForecast eveningForecast = dailyForecast.getHourlyForecasts().get(3);

        System.out.println("\n                             " + dailyForecast.getDate());
        System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┐ ");
        //Time of date
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getTimeOfDay(),morningForecast.getTimeOfDay(),
                noonForecast.getTimeOfDay(),eveningForecast.getTimeOfDay());
        System.out.println("├───────────────┼───────────────┼───────────────┼───────────────┤ ");

//        System.out.println("\n                         "+dailyForecast.getDate());
//        System.out.println("┌─────────────────────────────────────────┐");
//        //Time of date
//        System.out.printf("│%-15s │%-15s │%-15s │%-15s│\n" ,
//                nightForecast.getTimeOfDay(),morningForecast.getTimeOfDay(),
//                noonForecast.getTimeOfDay(),eveningForecast.getTimeOfDay());
        //Weather
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getWeather(),morningForecast.getWeather(),
                noonForecast.getWeather(),eveningForecast.getWeather());
        //Temperature
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                (int)nightForecast.getTemperature()+"°C ",(int)morningForecast.getTemperature()+"°C ",
                (int)noonForecast.getTemperature()+"°C ",(int)eveningForecast.getTemperature()+"°C ");
        //Wind
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getWindSpeed()+"km/h "+nightForecast.getWindDirection(),
                morningForecast.getWindSpeed()+"km/h "+morningForecast.getWindDirection(),
                noonForecast.getWindSpeed()+"km/h "+noonForecast.getWindDirection(),
                eveningForecast.getWindSpeed()+"km/h "+eveningForecast.getWindDirection());
        //Clouds
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getClouds()+"% clouds",morningForecast.getClouds()+"% clouds",
                noonForecast.getClouds()+"% clouds",eveningForecast.getClouds()+"% clouds");
        //Humidity
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getHumidity()+"% humidity",morningForecast.getHumidity()+"% humidity",
                noonForecast.getHumidity()+"% humidity",eveningForecast.getHumidity()+"% humidity");

        //Pressure
        System.out.printf("|  %-13s|  %-13s|  %-13s|  %-13s|\n",
                nightForecast.getPressure()+" hpa",morningForecast.getPressure()+" hpa",
                noonForecast.getPressure()+" hpa",eveningForecast.getPressure()+" hpa");

        System.out.println("└───────────────┴───────────────┴───────────────┴───────────────┘");
    }
}
