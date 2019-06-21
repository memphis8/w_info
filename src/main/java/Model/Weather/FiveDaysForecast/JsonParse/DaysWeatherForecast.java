package Model.Weather.FiveDaysForecast.JsonParse;


public class DaysWeatherForecast {


    private String cod;

    private Double message;

    private Integer cnt;

    private java.util.List<List> list = null;

    private City city;


    public java.util.List<List> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

}
