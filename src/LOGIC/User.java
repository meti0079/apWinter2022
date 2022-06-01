package LOGIC;

import java.util.ArrayList;

public class User {

    public String name;
    String pass;
    ArrayList<Ticket>tickets;
    
    public User(String name, String pass){
        this.name=name;
        this.pass=pass;
        tickets=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tickets.add(new Ticket());
        }
    }
}
