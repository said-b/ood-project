package project.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import javax.swing.JLabel;
import java.awt.Label;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwTextfield;
	private JTextField usernameTextField;
	/**
	 * @wbp.nonvisual location=71,19
	 */
	//private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	private final JLabel label = new JLabel("New JGoodies title");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setTitle("Shopping Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pwTextfield = new JPasswordField();
		pwTextfield.setName("");
		pwTextfield.setBounds(161, 191, 146, 20);
		contentPane.add(pwTextfield);

		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginBtn.setBounds(190, 229, 89, 23);
		contentPane.add(loginBtn);

		usernameTextField = new JTextField();
		usernameTextField.setBounds(161, 163, 146, 20);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);

		JLabel usernameLbl = new JLabel("Username");
		usernameLbl.setLabelFor(usernameLbl);
		usernameLbl.setBounds(95, 166, 60, 14);
		contentPane.add(usernameLbl);

		JLabel pwLbl = new JLabel("Password");
		pwLbl.setAutoscrolls(true);
		pwLbl.setLabelFor(pwLbl);
		pwLbl.setBounds(95, 194, 60, 14);
		contentPane.add(pwLbl);

		JLabel welcLbl = new JLabel("Welcome!");
		welcLbl.setHorizontalAlignment(SwingConstants.CENTER);
		welcLbl.setFont(new Font("Footlight MT Light", Font.PLAIN, 42));
		welcLbl.setBounds(91, 29, 283, 95);
		contentPane.add(welcLbl);
	}
}
