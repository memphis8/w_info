package Model.Weather.FiveDaysForecast;

public  class HourlyForecast {
    String timeOfDay;
    String weather;
    String windDirection;
    double temperature;
    double pressure;
    double windSpeed;
    int humidity;
    int clouds;

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public String getWeather() {
        return weather;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getClouds() {
        return clouds;
    }
}
