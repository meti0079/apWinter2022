package GUI;

import LOGIC.Controller;
import LOGIC.IController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(IController controller) {
        SignUp signUp= new SignUp(controller, this);
        this.add(signUp);
        initial();
        update();
        System.out.println("salalalalalla");;
    }
    private void initial() {
        this.setSize(new Dimension(700, 800));
        this.setCursor(HAND_CURSOR);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void update(){
        repaint();
        revalidate();
    }

}
