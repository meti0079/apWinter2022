package test;

import util.log.LogType;
import util.log.MasterLogger;

public class FileLoggerTest {
    public static void main(String[] args) {
         MasterLogger.getInstance().log("HI");
         MasterLogger.getInstance().error("OH NO");
         MasterLogger.getInstance().log("HI", LogType.INFO, FileLoggerTest.class);
         MasterLogger.getInstance().log("HI");
    }
}
