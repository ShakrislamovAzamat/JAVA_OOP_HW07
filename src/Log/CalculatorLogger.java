package Log;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorLogger {

    private static final Logger logger = Logger.getLogger(CalculatorLogger.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("calculator.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void logOperation(String operation) {
        logger.info("Operation completed: " + operation);
    }
}
