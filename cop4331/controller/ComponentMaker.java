package cop4331.controller;

import cop4331.model.Item;
import cop4331.model.User;

import javax.imageio.ImageIO;
//import javax.jws.soap.SOAPBinding;
import java.awt.*;
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
        JLabel price = new JLabel("Price: "+ Double.toString(item.getPrice()), 10);
        JLabel quantity = new JLabel("Available: "+ Integer.toString(item.getQuantity()), SwingConstants.LEADING);
        JTextField description = new JTextField(item.getDescText(), SwingConstants.CENTER);
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
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        name.setMaximumSize(new Dimension(Integer.MAX_VALUE, name.getMinimumSize().height));
        imgLabel.setMaximumSize(new Dimension(250, 250));
        price.setMaximumSize(new Dimension(Integer.MAX_VALUE, price.getMinimumSize().height));
        quantity.setMaximumSize(new Dimension(Integer.MAX_VALUE, quantity.getMinimumSize().height));
        description.setMaximumSize(new Dimension(250, description.getMinimumSize().height));
        addToCart.setMaximumSize(new Dimension(250, addToCart.getMinimumSize().height));
        addToWishList.setMaximumSize(new Dimension(250, addToWishList.getMinimumSize().height));
        
        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        addToCart.setAlignmentX(Component.CENTER_ALIGNMENT);
        addToWishList.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createTitledBorder("Item: " + item.getDescText()));
        
        
        panel.add(name);
        panel.add(imgLabel);
        panel.add(price);
        panel.add(quantity);
        panel.add(description);
        panel.add(addToCart);
        panel.add(addToWishList);

        return panel;
    }

    public JPanel cartItemPanel(Item item, User user) throws IOException{
        JPanel panel = new JPanel();
        //set bounds for all

        JLabel name = new JLabel(item.getName());
        BufferedImage img = ImageIO.read(new File(item.getImg()));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        JLabel price = new JLabel("Price: $"+ Double.toString(item.getPrice()), 10);
        JTextField amount = new JTextField("Amount: "+ Integer.toString(user.getCart().getQuantity(item.getId())), SwingConstants.LEADING);
        amount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(amount.toString()) < item.getQuantity()){
                    user.getCart().setQuantities(item.getId(), Integer.parseInt(amount.toString()));
                }
                else{
                    amount.setText(Integer.toString(user.getCart().getQuantity(item.getId())));
                }
            }
        });
        JTextField description = new JTextField(item.getDescText(), SwingConstants.CENTER);
//        JButton addToCart = new JButton("Add to Cart");
//        addToCart.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                user.getCart().add(item, 1);
//            }
//        });
//        JButton addToWishList = new JButton("Add to wish list");
//        addToWishList.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                user.getWishList().add(item);
//            }
//        });

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        name.setMaximumSize(new Dimension(Integer.MAX_VALUE, name.getMinimumSize().height));
        imgLabel.setMaximumSize(new Dimension(250, 250));
        price.setMaximumSize(new Dimension(Integer.MAX_VALUE, price.getMinimumSize().height));
        amount.setMaximumSize(new Dimension(Integer.MAX_VALUE, amount.getMinimumSize().height));
        description.setMaximumSize(new Dimension(250, description.getMinimumSize().height));
        //addToCart.setMaximumSize(new Dimension(250, addToCart.getMinimumSize().height));
        //addToWishList.setMaximumSize(new Dimension(250, addToWishList.getMinimumSize().height));

        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //addToCart.setAlignmentX(Component.CENTER_ALIGNMENT);
        //addToWishList.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createTitledBorder("Item: " + item.getDescText()));


        panel.add(name);
        panel.add(imgLabel);
        panel.add(price);
        panel.add(amount);
        panel.add(description);
        //panel.add(addToCart);
        //panel.add(addToWishList);

        return panel;

    }
    public JPanel wishlistItemPanel(Item item, User user) throws IOException {
        JPanel panel = new JPanel();
        //set bounds for all

        JLabel name = new JLabel(item.getName());
        BufferedImage img = ImageIO.read(new File(item.getImg()));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        JLabel price = new JLabel("Price: $"+ Double.toString(item.getPrice()), 10);
        JLabel quantity = new JLabel(Integer.toString(item.getQuantity()), SwingConstants.LEADING);
        JTextField description = new JTextField(item.getDescText(), SwingConstants.CENTER);
        JButton addToCart = new JButton("Add to Cart");
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCart().add(item, 1);
            }
        });
//        JButton addToWishList = new JButton("Add to wish list");
//        addToWishList.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                user.getWishList().add(item);
//            }
//        });

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        name.setMaximumSize(new Dimension(Integer.MAX_VALUE, name.getMinimumSize().height));
        imgLabel.setMaximumSize(new Dimension(250, 250));
        price.setMaximumSize(new Dimension(Integer.MAX_VALUE, price.getMinimumSize().height));
        quantity.setMaximumSize(new Dimension(Integer.MAX_VALUE, quantity.getMinimumSize().height));
        description.setMaximumSize(new Dimension(250, description.getMinimumSize().height));
        addToCart.setMaximumSize(new Dimension(250, addToCart.getMinimumSize().height));
        //addToWishList.setMaximumSize(new Dimension(250, addToWishList.getMinimumSize().height));

        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        addToCart.setAlignmentX(Component.CENTER_ALIGNMENT);
        //addToWishList.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createTitledBorder("Item: " + item.getDescText()));


        panel.add(name);
        panel.add(imgLabel);
        panel.add(price);
        panel.add(quantity);
        panel.add(description);
        panel.add(addToCart);
        //panel.add(addToWishList);

        return panel;
    }
    public JPanel inventoryItemPanel(Item item, User user) throws IOException{

        JPanel panel = new JPanel();
        //set bounds for all

        JLabel name = new JLabel(item.getName());
        BufferedImage img = ImageIO.read(new File(item.getImg()));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        JTextField price = new JTextField("Price: $"+ Double.toString(item.getPrice()), 10);
        price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                item.setPrice(Double.parseDouble(price.toString()));
            }
        });
        JTextField amount = new JTextField("Amount: "+ Integer.toString(user.getCart().getQuantity(item.getId())), SwingConstants.LEADING);
        amount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(amount.toString()) < item.getQuantity()){
                    user.getCart().setQuantities(item.getId(), Integer.parseInt(amount.toString()));
                }
                else{
                    amount.setText(Integer.toString(user.getCart().getQuantity(item.getId())));
                }
            }
        });
        JTextField description = new JTextField(item.getDescText(), SwingConstants.CENTER);
//        JButton addToCart = new JButton("Add to Cart");
//        addToCart.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                user.getCart().add(item, 1);
//            }
//        });
//        JButton addToWishList = new JButton("Add to wish list");
//        addToWishList.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                user.getWishList().add(item);
//            }
//        });

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        name.setMaximumSize(new Dimension(Integer.MAX_VALUE, name.getMinimumSize().height));
        imgLabel.setMaximumSize(new Dimension(250, 250));
        price.setMaximumSize(new Dimension(Integer.MAX_VALUE, price.getMinimumSize().height));
        amount.setMaximumSize(new Dimension(Integer.MAX_VALUE, amount.getMinimumSize().height));
        description.setMaximumSize(new Dimension(250, description.getMinimumSize().height));
        //addToCart.setMaximumSize(new Dimension(250, addToCart.getMinimumSize().height));
        //addToWishList.setMaximumSize(new Dimension(250, addToWishList.getMinimumSize().height));

        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //addToCart.setAlignmentX(Component.CENTER_ALIGNMENT);
        //addToWishList.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createTitledBorder("Item: " + item.getDescText()));


        panel.add(name);
        panel.add(imgLabel);
        panel.add(price);
        panel.add(amount);
        panel.add(description);
        //panel.add(addToCart);
        //panel.add(addToWishList);

        return panel;


    }
    
    public JPanel nxtBtn()
    {
        JButton nextPage = new JButton("Next Page");
        JPanel panel2 = new JPanel();
    	
        panel2.add(nextPage);
        
        panel2.setLayout(new BorderLayout());
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel2.add(nextPage);
        
        return panel2;
    }
    
    public void outerPanel(JPanel p)
    {
    	
    }
    
    public JPanel outerPanel2(JPanel p)
    {
    	JPanel panel = new JPanel();
    	panel.add(p, BorderLayout.CENTER);
    	
        return panel;
    }
}
