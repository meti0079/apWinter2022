package LOGIC;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveUser {


    public void saveAUser(User user){
        GsonBuilder gsonBuilder= new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson= gsonBuilder.create();
        String userjson=gson.toJson(user);
        try {
            FileWriter writer= new FileWriter(System.getProperty("user.dir")+"//src//"+ user.name+".txt");
            writer.write(userjson);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public User loadUser(String name) {
        try {
        File file = new File(System.getProperty("user.dir") + "//src//" + name + ".txt");
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

            return user;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       return null;
    }
}
