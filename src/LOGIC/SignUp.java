package LOGIC;

import java.io.FileWriter;
import java.io.IOException;

public class SignUp {
    boolean isValidName;
    boolean isValidpass;

    public void checkName(String name){

        FileWriter file;
        try {
            file=new FileWriter(System.getProperty("user.dir")+"//src//"+name+".txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void checkPass(String name , String pass){}



}
