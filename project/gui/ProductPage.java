package project.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ProductPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductPage frame = new ProductPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductPage() {
		setTitle("Shopping Cart");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Page");
		lblNewLabel.setBounds(199, 15, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/vi_2.5l_rnd_stewpot_1093028.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));;
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(51, 226, 125, 125);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ShoppingCart.class.getResource("/src/E448457H-1_thumb.jpg")));;
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(51, 54, 125, 125);
		contentPane.add(lblNewLabel_2);
		
		JLabel waterTitle = new JLabel("Water");
		waterTitle.setBounds(199, 54, 46, 14);
		contentPane.add(waterTitle);
		
		JLabel waterPrice = new JLabel("$29.99");
		waterPrice.setBounds(199, 165, 46, 14);
		contentPane.add(waterPrice);
		
		JLabel waterDesc = new JLabel("Water bottle that will keep you hydrated!");
		waterDesc.setBounds(199, 79, 199, 63);
		contentPane.add(waterDesc);
		
		JLabel bowlTitle = new JLabel("Bowl");
		bowlTitle.setBounds(199, 226, 46, 14);
		contentPane.add(bowlTitle);
		
		JLabel bowlPrice = new JLabel("$79.99");
		bowlPrice.setBounds(199, 340, 46, 14);
		contentPane.add(bowlPrice);
		
		JLabel bowlDesc = new JLabel("The best bowl in the world to put your food");
		bowlDesc.setBounds(199, 251, 256, 55);
		contentPane.add(bowlDesc);
		
		JButton waterCartBtn = new JButton("Add to Cart");
		waterCartBtn.setBounds(385, 156, 89, 23);
		contentPane.add(waterCartBtn);
		
		JButton waterWishBtn = new JButton("+ Wishlist");
		waterWishBtn.setBounds(385, 119, 89, 23);
		contentPane.add(waterWishBtn);
		
		JButton bowlWishBtn = new JButton("+ Wishlist");
		bowlWishBtn.setBounds(385, 294, 89, 23);
		contentPane.add(bowlWishBtn);
		
		JButton bowlCartBtn = new JButton("Add to Cart");
		bowlCartBtn.setBounds(385, 328, 89, 23);
		contentPane.add(bowlCartBtn);
	}
}
