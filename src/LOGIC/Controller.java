package LOGIC;

public class Controller {

    public static Controller controller;


    private Controller(){

    }

    public static Controller getInstance(){
        if (controller==null){
            controller=new Controller();
        }
        return controller;
    }

    public boolean signUp(Message message){


    }




}
