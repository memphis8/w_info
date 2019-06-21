package View.HelpInfo;

public class ErrInfo {
    public static void showErrInfo() {
        System.out.println("Incorrect command!");
        System.out.println("Usage:\n" +
                "winfo  [-c][-f][-a] <YourCity>\n" +
                "Where -c - current weather ; -f - weather forecast ; -a - all weather info;\n");
    }
}
