package project.controller;

import project.model.Item;
import project.model.User;

import javax.imageio.ImageIO;
import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ComponentMaker {

    public ComponentMaker(){ }

    public JPanel itemPanel(Item item, User user) throws IOException {
        JPanel panel = new JPanel();
        //set bounds for all
        JLabel name = new JLabel(item.getName());
        BufferedImage img = ImageIO.read(new File(item.getImg()));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        JLabel price = new JLabel(Double.toString(item.getPrice()));
        JLabel quantity = new JLabel(Integer.toString(item.getQuantity()));
        JTextField description = new JTextField(item.getDescText());
        JButton addToCart = new JButton("Add to Cart");
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCart().add(item, 1);
            }
        });
        JButton addToWishList = new JButton("Add to wish list");
        addToWishList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getWishList().add(item);
            }
        });
        panel.add(name);
        panel.add(imgLabel);
        panel.add(price);
        panel.add(quantity);
        panel.add(description);
        panel.add(addToCart);
        panel.add(addToWishList);

        return panel;
    }
}
