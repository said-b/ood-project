package project.controller;

//import jdk.internal.util.xml.impl.ReaderUTF8;
import project.model.Item;
import project.model.MasterList;
import project.model.User;
//import sun.management.snmp.jvminstr.JvmRTClassPathEntryImpl;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
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
        HashMap<String, User> userHashMap;
        MasterList masterList;
        //if data file exists, deserialize data into ^ variables
        //if not initialize new variables

        cMTester();
    }




}
