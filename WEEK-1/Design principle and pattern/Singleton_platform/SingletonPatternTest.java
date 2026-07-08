import java.util.*;

public class SingletonPatternTest {

    public static void main(String[] args) {

       
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

       
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

       
        System.out.println("\n--- Singleton Verification ---");
        System.out.println("logger1 hashCode: " + logger1.hashCode());
        System.out.println("logger2 hashCode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the SAME instance. Singleton works!");
        } else {
            System.out.println("logger1 and logger2 are DIFFERENT instances. Singleton failed!");
        }
    }
}

class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("[Logger] " + message);
    }
}