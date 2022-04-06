package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        SignUp signUp= new SignUp(this);
        this.add(signUp);
        initial();
        update();
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
