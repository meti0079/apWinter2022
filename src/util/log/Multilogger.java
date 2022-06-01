package util.log;

import java.util.ArrayList;
import java.util.List;

public class Multilogger implements ILogger {
    private final List<ILogger> loggers;

    public Multilogger() {
        loggers = new ArrayList<>();
    }

    public static Multilogger create(ILogger... loggers) {
        Multilogger ml = new Multilogger();
        for (ILogger logger : loggers) {
            ml.subscribeLogger(logger);
        }
        return ml;
    }

    public void subscribeLogger(ILogger logger) {
        loggers.add(logger);
    }

    @Override
    public void log(String message) {
        for (ILogger logger : loggers) {
            logger.log(message);
        }
    }

    @Override
    public void log(String message, LogType type) {
        for (ILogger logger : loggers) {
            logger.log(message, type);
        }
    }

    @Override
    public void log(String message, LogType type, Class<?> clazz) {
        for (ILogger logger : loggers) {
            logger.log(message, type, clazz);
        }
    }
}
