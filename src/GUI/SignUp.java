package GUI;

import LOGIC.Controller;
import LOGIC.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp  extends JPanel{
    JTextField nameField;
    JPasswordField passwordField;
    JButton signUp;
    JCheckBox showPass;
    JLabel nameLable;
    JLabel passLable;

    MainFrame frame;
    public SignUp(MainFrame frame){
        this.frame=frame;
        init();
        initComp();
        aligncomp();
        setListener();
    }
    private void init(){
        setSize(700, 700);
        setLayout(null);
    }
    private void initComp(){
        nameField= new JTextField();
        passwordField=new JPasswordField();
        signUp=new JButton("SIGN UP");
        showPass=new JCheckBox();
        nameLable=new JLabel("NAME : ");
        passLable= new JLabel("PASSWORD : ");

    }
    private void aligncomp(){
        nameField.setBounds(200,200,100,50);
        this.add(nameField);
    nameLable.setBounds(100,200,100,50);
        this.add(nameLable);
        passLable.setBounds(100,300,100,50);
        this.add(passLable);
        passwordField.setBounds(200,300,100,50);
        this.add(passwordField);
        showPass.setBounds(350,300,50,50);
        this.add(showPass);
        signUp.setBounds(400,400,100,50);
        this.add(signUp);

    }
    private void setListener(){
        showPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPass.isSelected()){
                    passwordField.setEchoChar((char)0);
                }else{
                    passwordField.setEchoChar('*');
                }
            }
        });
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=nameField.getText();
                String pass= passwordField.getText();
                Message message= new Message(name,pass);
                if (Controller.getInstance().signUp(message)){
                    JPanel  jPanel= new JPanel();
                    JButton jButton= new JButton("Main page");
                    jPanel.setBounds(0,0,700,700);
                    jPanel.add(jButton);
                    frame.setContentPane(jPanel);
                    frame.update();
                }else {
                    JOptionPane.showMessageDialog(frame,"enter a valid username");

                }
            }
        });
    }

}
