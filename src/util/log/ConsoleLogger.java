package util.log;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class ConsoleLogger extends StreamLogger {
    public ConsoleLogger() {
        super(System.out);
    }
}
