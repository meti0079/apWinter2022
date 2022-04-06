import GUI.MainFrame;
import LOGIC.SaveUser;

public class main {
    public static void main(String[] args) {
        MainFrame mainFrame=new MainFrame();

        SaveUser saveUser= new SaveUser();
        System.out.println(saveUser.loadUser("mehdi").name);
    }
}
