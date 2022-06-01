package util.log;

// singleton
public class MasterLogger implements ILogger {
    private static MasterLogger instance = new MasterLogger();
    
    private ILogger logger;

    private MasterLogger() {
        logger = Multilogger.create(
                new ConsoleLogger(),
                new FileLogger("zoo.log")
            );
    }
    
    public static MasterLogger getInstance() {
        return instance;
    }

    @Override
    public void log(String message, LogType type) {
        logger.log(message, type);
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }

    @Override
    public void log(String message, LogType type, Class<?> clazz) {
        logger.log(message, type, clazz);
    }
}
