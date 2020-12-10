package cop4331.controller;


import cop4331.gui.GuiFunctions;
import cop4331.model.Item;
import cop4331.model.MasterList;
import cop4331.model.User;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

//import jdk.internal.util.xml.impl.ReaderUTF8;
// import project.model.Item;
// import project.model.MasterList;
// import project.model.User;
//import sun.management.snmp.jvminstr.JvmRTClassPathEntryImpl;

// import javax.swing.*;

import java.awt.BorderLayout;
//import java.io.File;
//import java.io.IOException;

import java.util.HashMap;

public class Driver {

    public static void cMTester(){
        Item testItem = new Item(1,10.50, "Water", 1, "Water","src/E448457H-1_thumb.jpg");
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        

        
        //implement logic to layout good
        JPanel panel, panel2;
        try{
            panel = new ComponentMaker().itemPanel(testItem, new User("a", "b", MasterList.getInstance()));
        }catch(IOException e){
            throw new RuntimeException("img file not found");
        }
        panel2 = new ComponentMaker().nxtBtn();
        frame.add(panel2, BorderLayout.SOUTH);
        
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
        String dataFile ="src/src/data.ser";

        try {
            FileInputStream fileIn = new FileInputStream(dataFile);
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
        MasterList finalMasterList = masterList;
        HashMap<String, User> finalUserHashMap = userHashMap;
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    FileOutputStream fileOut = new FileOutputStream(dataFile);
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(finalMasterList);
                    out.writeObject(finalUserHashMap);
                    out.close();
                    fileOut.close();
                    System.out.println("Serialized data is saved in " + dataFile);
                } catch (IOException i) {
                    i.printStackTrace();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });





        //cMTester();
    }




}
