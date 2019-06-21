package Model.Weather.FiveDaysForecast.JsonParse;


public class Main {


    private Double temp;
    private Double tempMin;
    private Double tempMax;
    private Double pressure;
    private Double seaLevel;
    private Double grndLevel;
    private Integer humidity;
    private Double tempKf;

    public Integer getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getTemp() {
        return temp-273;
    }
}
