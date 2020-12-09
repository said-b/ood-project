package project.controller;

import project.gui.GuiFunctions;
import project.model.Item;
import project.model.MasterList;
import project.model.User;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;

public class Driver {

    public static void cMTester(){
        Item testItem = new Item(1,10.50, "water", 2, "Water","src/src/E448457H-1_thumb.jpg");
        JFrame frame = new JFrame();

        JPanel panel;
        try{
            panel = new ComponentMaker().itemPanel(testItem, new User("a", "b", MasterList.getInstance()));
        }catch(IOException e){
            throw new RuntimeException("img file not found");
        }
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String args[]){
        HashMap<String, User> userHashMap = null;
        MasterList masterList = null;
        User currentUser = null;
        //if data file exists, deserialize data into ^ variables
        //if not initialize new variables
        String dataFile ="";

        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            masterList = (MasterList) in.readObject();
            userHashMap = (HashMap<String,User>) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException f) {
            userHashMap = new HashMap<>();
            masterList = MasterList.getInstance();
        } catch (IOException i){
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        JFrame frame = new JFrame();
        GuiFunctions functionHandler = new GuiFunctions(currentUser, masterList, userHashMap);
        functionHandler.loginScreen(frame);
        frame.setVisible(true);
        frame.setResizable(false);




        //cMTester();
    }




}
