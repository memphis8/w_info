package Model.Weather.CurrentForecast;

public class WeatherInfo {
    private String city;
    private String weather;
    private String windDirection;
    private int temperatureMin;
    private int temperatureMax;
    private int pressure;
    private int windSpeed;
    private int humidity;
    private int clouds;

    public void setCity(String city) {
        this.city = city;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public void setTemperatureMin(int temperatureMin) {
        this.temperatureMin = temperatureMin-273;
    }

    public void setTemperatureMax(int temperatureMax) {
        this.temperatureMax = temperatureMax-273;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public String getCity() {
        return city;
    }

    public String getWeather() {
        return weather;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public int getTemperatureMin() {
        return temperatureMin;
    }

    public int getTemperatureMax() {
        return temperatureMax;
    }

    public int getPressure() {
        return pressure;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getClouds() {
        return clouds;
    }
}

