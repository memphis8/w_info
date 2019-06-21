package Model.Weather.FiveDaysForecast.JsonParse;


public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

}
