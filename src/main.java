import GUI.MainFrame;
import LOGIC.Controller;
import LOGIC.IController;
import LOGIC.SaveUser;
import loggedimpl.LoggedController;

public class main {
    public static void main(String[] args) {
        IController controller = new LoggedController();
        MainFrame mainFrame=new MainFrame(controller);

        SaveUser saveUser= new SaveUser();
        System.out.println(saveUser.loadUser("aeirya").name);
    }
}
