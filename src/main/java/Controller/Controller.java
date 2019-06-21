package Controller;

import Model.HttpClient;
import View.HelpInfo.ErrInfo;
import View.HelpInfo.HelpInfo;
import View.HelpInfo.StartInfo;

import java.io.IOException;


public class Controller {

    public static void createSession(String[] input) {

        int act = attributeChecker(input);

        //String city = "New York";

        if (act == -1) {
            ErrInfo.showErrInfo();
        }
        if (act == 0) {
            StartInfo.showStartInfo();
        }
        if (act == 1) {
            HelpInfo.showHelpInfo();
        }

        if (act > 1) {
            String city = cityDepender(input);
            if (act == 2) {
                getWeather(city, 1);
                getWeather(city, 2);
            } else if (act == 3) {
                getWeather(city, 1);

            }
            if (act == 4) {
                getWeather(city, 2);
            }
        }
    }

    private static int attributeChecker(String[] input) {

        if (input.length == 0) {
            return 0;
        }
        if (input.length == 1) {
            if (input[0].equals("-h")) return 1;
        }
        if (input.length > 1) {
            if (input[0].equals("-a")) {
                return 2;
            }
            if (input[0].equals("-c")) return 3;
            if (input[0].equals("-f")) return 4;
        }
        return -1;
    }

    private static String cityDepender(String[] input) {
        if (input.length == 2) {
            return input[1];
        } else {
            String city = input[1];
            for (int i = 2; i < input.length; i++) {
                city = city.concat(" ").concat(input[i]);
            }
            return city;
        }
    }

    private static void getWeather(String city, int forecastType) {
        try {
            HttpClient.getApiWeatherInfo(city, forecastType);
            //HttpClient.getApiWeatherInfo("Rome", 2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
