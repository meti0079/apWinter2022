package util.log;

public interface ILogger {
    void log(String message);
    void log(String message, LogType type);
    void log(String message, LogType type, Class<?> clazz);

    default void error(String message) {
        log(message, LogType.ERROR);
    }

    default void error(String message, Class<?> clazz) {
        log(message, LogType.ERROR, clazz);
    }
}
