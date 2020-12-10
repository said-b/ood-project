package project.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoppingCart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingCart frame = new ShoppingCart();
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
	public ShoppingCart() {
		setResizable(false);
		setTitle("Shopping Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Cart is Empty");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(173, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel bowlPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/src/vi_2.5l_rnd_stewpot_1093028.jpg")).getImage();
		bowlPic.setIcon(new ImageIcon(img));;
		bowlPic.setHorizontalAlignment(SwingConstants.CENTER);
		bowlPic.setBounds(21, 237, 133, 133);
		contentPane.add(bowlPic);
		
		JLabel waterPic = new JLabel("");
		waterPic.setIcon(new ImageIcon(ShoppingCart.class.getResource("/src/E448457H-1_thumb.jpg")));;
		waterPic.setHorizontalAlignment(SwingConstants.CENTER);
		waterPic.setBounds(21, 60, 133, 133);
		contentPane.add(waterPic);
		
		JButton checkoutBtn = new JButton("Checkout");
		checkoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		checkoutBtn.setBounds(385, 427, 89, 23);
		contentPane.add(checkoutBtn);
		
		JLabel costLbl = new JLabel("Total Cost:");
		costLbl.setBounds(354, 376, 99, 14);
		contentPane.add(costLbl);
	}
}
