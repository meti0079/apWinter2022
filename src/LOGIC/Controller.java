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
        String name=message.getName();
        String pass=message.getPass();
        SignUp signUp= new SignUp();
        signUp.checkName(name);
        if (signUp.isValidName){
            User user= new User(name, pass);
            new SaveUser().saveAUser(user);
            return true;
        }
        return false;
    }




}
