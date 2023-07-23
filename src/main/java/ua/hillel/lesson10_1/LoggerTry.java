package ua.hillel.lesson10_1;

public class LoggerTry {
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String RESET = "\033[0m";

    public void info(LogLevel level) {
        System.out.println(ANSI_GREEN_BACKGROUND + "Everything is good!" + RESET);
    }

    public void warn(LogLevel level) {
        System.out.println(ANSI_YELLOW_BACKGROUND + "Double check the information" + RESET);
    }

    public void debug(LogLevel level) {
        System.out.println(ANSI_CYAN_BACKGROUND + "Debug starting" + RESET);
    }

    public void error(LogLevel level) {
        System.out.println(ANSI_CYAN_BACKGROUND + "Error!!!" + RESET);
    }

    public enum LogLevel {
        INFO,
        WARN,
        DEBUG,
        ERROR;
    }


}
