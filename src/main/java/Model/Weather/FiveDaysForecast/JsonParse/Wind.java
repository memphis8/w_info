package Model.Weather.FiveDaysForecast.JsonParse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Double deg;

    private String windDirection;

    public Double getSpeed() {
        return speed;
    };

    public Double getDeg() {
        return deg;
    }

    public static String windDirectionConverter(double degrees) {
        int val = (int) ((degrees / 22.5) + .5);
        String[] windTypes = {"N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"};
        return   windTypes[(val % 16)];
    }

}
