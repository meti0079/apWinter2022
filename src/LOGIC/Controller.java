package LOGIC;

import util.log.LogType;
import util.log.MasterLogger;

public class Controller implements IController {

//    public static Controller controller;

    public Controller(){

    }

//    public static Controller getInstance(){
//        if (controller==null){
//            controller=new Controller();
//        }
//        return controller;
//    }

    public boolean signUp(Message message) {
        String name=message.getName();
        String pass=message.getPass();
        SignUp signUp= new SignUp();
        
        if (signUp.checkName(name)){
            User user= new User(name, pass);
            new SaveUser().saveUser(user);

            return true;
        }

        return false;
    }
}
