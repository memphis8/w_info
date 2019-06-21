package Model.Weather.FiveDaysForecast.JsonParse;


import java.text.DateFormatSymbols;

public class List {


    private Integer dt;

    private Main main;

    private java.util.List<Weather> weather = null;

    private Clouds clouds;

    private Wind wind;

    private Snow snow;

    private Sys sys;

    private String dtTxt;

    public Main getMain() {
        return main;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }


    public Clouds getClouds() {
        return clouds;
    }


    public Wind getWind() {
        return wind;
    }




}
