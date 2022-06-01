package LOGIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import util.log.MasterLogger;

public class SignUp {

    public boolean checkName(String name){
        File file =new File(System.getProperty("user.dir")+"//src//"+name+".txt");
        if (file.exists()){
            MasterLogger.getInstance().error("user " + name + " already exists");
            return false;
        }else{
            return true;
        }
    }

}
