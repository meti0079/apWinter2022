import util.log.MasterLogger;

public class testMain {
    public static void main(String[] args) {
        String message = "hi this is a log";
        MasterLogger.getInstance().log(message);
    }
}
