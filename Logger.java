package DailyJavaTraining;

public class Logger {


    private static Logger instance;

    private String fileName;


    private Logger() {
        this.fileName = "application.log";
    }


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public void write(String message) {
        System.out.println("Writing '" + message + "' to log file: " + fileName);
    }
}

