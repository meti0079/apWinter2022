package LOGIC;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import util.log.LogType;
import util.log.MasterLogger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveUser {

    public void saveUser(User user){
        GsonBuilder gsonBuilder= new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson= gsonBuilder.create();
        String userjson=gson.toJson(user);
        try {
            String address = System.getProperty("user.dir")+"//src//"+ user.name+".txt";
            FileWriter writer= new FileWriter(address);
            writer.write(userjson);
            writer.close();
            MasterLogger.getInstance().log("used saved to " + address, LogType.INFO);
        } catch (IOException e) {
            MasterLogger.getInstance().error("used save error");
            MasterLogger.getInstance().error(e.toString(), this.getClass());
            // e.printStackTrace();
        }
    }
    
    public User loadUser(String name) {
        try {
            String address = System.getProperty("user.dir") + "//src//" + name + ".txt";
            File file = new File(address);
            User user;
            
            Scanner scanner= new Scanner(file);
            String userjson="";
            while (scanner.hasNext()){
                userjson+=scanner.nextLine();
            }
            GsonBuilder gsonBuilder= new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            Gson gson= gsonBuilder.create();
            user=gson.fromJson(userjson,User.class);
            
            MasterLogger.getInstance().log("used loaded from" + address, LogType.INFO, this.getClass());
            return user;

        } catch (FileNotFoundException e) {
            MasterLogger.getInstance().error(e.toString(), this.getClass());
            // e.printStackTrace();
        }

       return null;
    }
}
