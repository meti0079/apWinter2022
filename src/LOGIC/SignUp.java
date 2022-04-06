package LOGIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SignUp {
    boolean isValidName;

    public void checkName(String name){
        File file =new File(System.getProperty("user.dir")+"//src//"+name+".txt");
        if (file.exists()){
            isValidName=false;
        }else{
            isValidName=true;
        }

    }

}
