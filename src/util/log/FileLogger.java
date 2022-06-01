package util.log;

import java.io.*;

public class FileLogger extends StreamLogger {

    public FileLogger(String path) {
        super(openStream(path));
    }

    private static PrintStream openStream(String path) {
        File file = new File(path);

        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    System.out.println("log file could not be created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            return new PrintStream(new FileOutputStream(file, true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
