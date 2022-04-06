package LOGIC;

import java.util.Random;

public class Ticket {
    public  enum Place{
        A,B,C
    }

    int price;
    int id;
    Place place;


    public Ticket( ){
        price=100;

        id=new Random().nextInt();
        place=Place.A;
    }


}
