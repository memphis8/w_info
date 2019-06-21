package View.HelpInfo;

public class HelpInfo {
    public static void showHelpInfo() {
        System.out.println(" .----------------.  .----------------.  .-----------------. .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| | _____  _____ | || |     _____    | || | ____  _____  | || |  _________   | || |     ____     | |\n" +
                "| ||_   _||_   _|| || |    |_   _|   | || ||_   \\|_   _| | || | |_   ___  |  | || |   .'    `.   | |\n" +
                "| |  | | /\\ | |  | || |      | |     | || |  |   \\ | |   | || |   | |_  \\_|  | || |  /  .--.  \\  | |\n" +
                "| |  | |/  \\| |  | || |      | |     | || |  | |\\ \\| |   | || |   |  _|      | || |  | |    | |  | |\n" +
                "| |  |   /\\   |  | || |     _| |_    | || | _| |_\\   |_  | || |  _| |_       | || |  \\  `--'  /  | |\n" +
                "| |  |__/  \\__|  | || |    |_____|   | || ||_____|\\____| | || | |_____|      | || |   `.____.'   | |\n" +
                "| |              | || |              | || |              | || |              | || |     v1.0     | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
        System.out.println("====================================================================================================");
        System.out.println("This weather app is one of the most simple and useful free weather apps for UNIX  systems.\n" +
                "\n" +
                "Full features: \n" +
                "☼Current weather: weather forecast in your city now; \n" +
                "☼Weather forecast: weather forecast in your city for 5 days; \n" +
                "☼All weather info: weather forecast in your city with all information.\n" +
                "\n" +
                "Usage:\n" +
                "winfo  [-c][-f][-a] <YourCity>\n" +
                "Where -c - current weather ; -f - weather forecast ; -a - all weather info;\n" +
                "\n" +
                "Its so easy to receive the weather conditions in your current location.\n" +
                "Winfo provides detailed local forecast, the current temperature in Celsius , atmospheric pressure,"+
                "\nweather conditions, relative humidity, wind speed and direction, in addition to five days in future"+
                "\nand hourly weather forecast.\n" +
                "Realtime temperature, humidity, pressure and wind direction are all in the winfo based.");
    }
}
