package project.gui;

import project.model.MasterList;
import project.model.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class GuiFunctions {

    private User currentUser;
    private MasterList masterList;
    private HashMap<String, User> userHashMap;

    public GuiFunctions(User currentUser, MasterList masterList, HashMap<String, User> userHashMap) {
        this.currentUser = currentUser;
        this.masterList = masterList;
        this.userHashMap = userHashMap;
    }

    public void setuser(User user){
        this.currentUser = user;
    }
    public void loginScreen(JFrame jFrame){
        JPanel contentPane;
        JPasswordField pwTextfield;
        //JTextField usernameTextField = null;
        jFrame.setTitle("Shopping Cart");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        jFrame.setContentPane(contentPane);
        contentPane.setLayout(null);

        final JTextField usernameTextField = new JTextField();
        usernameTextField.setBounds(161, 163, 146, 20);
        contentPane.add(usernameTextField);
        usernameTextField.setColumns(10);

        pwTextfield = new JPasswordField();
        pwTextfield.setName("");
        pwTextfield.setBounds(161, 191, 146, 20);
        contentPane.add(pwTextfield);

        JLabel errorTxt = new JLabel();
        errorTxt.setBounds(190, 300, 200, 23);
        contentPane.add(errorTxt);
        JButton loginBtn = new JButton("Login");
        HashMap<String,User> users = this.userHashMap;

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameTextField.getText();
                String enteredPassword = new String(pwTextfield.getPassword());
                if(users != null){
                    if(users.containsKey(enteredUsername)){
                        if(users.get(enteredUsername).getPassword().equals(enteredPassword)){
                            setuser(users.get(enteredUsername));
                            //switch context

                        }
                        else{
                            errorTxt.setText("Incorrect Password");
                        }
                    }
                    else{
                        errorTxt.setText("User doesn't exist.");
                    }
                }
                else{
                    errorTxt.setText("User doesn't exist.");
                }
        }
    });
        loginBtn.setBounds(190, 229, 89, 23);
        JButton registerBtn = new JButton("Register");
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameTextField.getText();
                String enteredPassword = new String(pwTextfield.getPassword());
                if(users == null){
                    //create new user
                    User user = new User(enteredUsername, enteredPassword, masterList);
                    userHashMap.put(enteredUsername, user);
                    GuiFunctions.this.setuser(user);
                    errorTxt.setText("Account created.");
                }
                else if(!users.containsKey(enteredUsername)){
                    //create new user
                    User user = new User(enteredUsername, enteredPassword, masterList);
                    userHashMap.put(enteredUsername, user);
                    GuiFunctions.this.setuser(user);
                    errorTxt.setText("Account created.");
                }
            }
        });
        registerBtn.setBounds(190, 260, 89, 23);

        contentPane.add(registerBtn);
        contentPane.add(loginBtn);


        JLabel usernameLbl = new JLabel("Username");
        usernameLbl.setLabelFor(usernameLbl);
        usernameLbl.setBounds(95, 166, 60, 14);
        contentPane.add(usernameLbl);

        JLabel pwLbl = new JLabel("Password");
        pwLbl.setAutoscrolls(true);
        pwLbl.setLabelFor(pwLbl);
        pwLbl.setBounds(95, 194, 60, 14);
        contentPane.add(pwLbl);

        JLabel welcLbl = new JLabel("BAZAAR");
        welcLbl.setHorizontalAlignment(SwingConstants.CENTER);
        welcLbl.setFont(new Font("Footlight MT Light", Font.PLAIN, 42));
        welcLbl.setBounds(91, 29, 283, 95);
        contentPane.add(welcLbl);
    }
}
