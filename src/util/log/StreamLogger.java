package util.log;

import java.io.PrintStream;

import util.time.Time;

public class StreamLogger implements ILogger {

    private final PrintStream out;

    public StreamLogger(PrintStream out) {
        this.out = out;
    }

    @Override
    public void log(String message) {
        log(message, LogType.NORMAL);
    }

    
    private String getTime() {
        return Time.getTime();
    }
    
    @Override
    public void log(String message, LogType type) {
        out.println(String.format("%s - %s - %s", getTime(), type.toString(), message));
    }
    
    @Override
    public void log(String message, LogType type, Class<?> clazz) {
        out.println(String.format("%s - %s - %s - %s", getTime(), type.toString(), clazz.getName(), message));
    }

    public void close() {
        out.close();
    }
}
