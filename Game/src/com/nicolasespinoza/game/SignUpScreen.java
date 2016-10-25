package com.nicolasespinoza.game;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class SignUpScreen extends JFrame {

	private static final long serialVersionUID = 4084343683708178089L;

	JPanel panel = new JPanel();
	
	JTextArea username = new JTextArea();
	JLabel usernameIcon = new JLabel();
	JLabel usernameBar = new JLabel();
	
	JTextArea email = new JTextArea();
	JLabel emailIcon = new JLabel();
	JLabel emailBar = new JLabel();
	
	JLabel passwordIcon = new JLabel();
	JLabel passwordBar = new JLabel();
	
	JButton loginButton = new JButton();
	JButton signUpButton = new JButton();
	
	JLabel background = new JLabel();
	JLabel guest = new JLabel();

	JPasswordField passwordField = new JPasswordField();
	char[] passwordText;
	
	Font generalFont = new Font("Futura", Font.PLAIN, 13);
	
	public SignUpScreen() {
		
		try {
			
			setIconImage(ImageIO.read(getClass().getResource("/resources/favicon.png")));
			
		} catch (IOException e) {
		  		
		  	e.printStackTrace();
		  		
		}
		
		setSize(1015, 700);
		setResizable(false);
//		setLocation(450, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(52, 73, 94));
		setTitle("Game | Sign Up");
		
		background.setIcon(new ImageIcon(getClass().getResource("/resources/mountain-test.jpeg")));
		background.setBorder(null);
		background.setBounds(-80, 0, 1100, 700);
		
		guest.setIcon(new ImageIcon(getClass().getResource("/resources/logo.png")));
		guest.setBorder(null);
		guest.setBounds(350, 150, 306, 100);
		
		username.setText("Username");
		username.setBorder(null);
		username.setBounds(400, 283, 150, 20);
		username.setFont(generalFont);
		usernameIcon.setIcon(new ImageIcon(getClass().getResource("/resources/usernameIcon.png")));
		usernameIcon.setBorder(null);
		usernameIcon.setBounds(375, 280, 25, 25);
		usernameBar.setIcon(new ImageIcon(getClass().getResource("/resources/textBar.png")));
		usernameBar.setBorder(null);
		usernameBar.setBounds(370, 273, 265, 44);
	
		passwordIcon.setIcon(new ImageIcon(getClass().getResource("/resources/passwordIcon.png")));
		passwordIcon.setBorder(null);
		passwordIcon.setBounds(375, 350, 25, 25);
		passwordBar.setIcon(new ImageIcon(getClass().getResource("/resources/textBar.png")));
		passwordBar.setBorder(null);
		passwordBar.setBounds(370, 343, 265, 44);
		passwordField.setBorder(null);
		passwordField.setBounds(400, 353, 150, 20);
		passwordField.setEchoChar((char) 0);
		passwordField.setEchoChar('•');
		passwordField.setText("Password");
		passwordText = passwordField.getPassword();
		
		email.setText("Email");
		email.setBorder(null);
		email.setBounds(405, 425, 150, 20);
		email.setFont(generalFont);
		emailIcon.setIcon(new ImageIcon(getClass().getResource("/resources/emailIcon.png")));
		emailIcon.setBorder(null);
		emailIcon.setBounds(378, 423, 25, 25);
		emailBar.setIcon(new ImageIcon(getClass().getResource("/resources/textBar.png")));
		emailBar.setBorder(null);
		emailBar.setBounds(370, 413, 265, 44);
		
		signUpButton.setIcon(new ImageIcon(getClass().getResource("/resources/signUpButton.png")));
		signUpButton.setBorder(null);
		signUpButton.setBounds(450, 483, 107, 34);
		
		panel.setLayout(null);
		
		panel.add(passwordField);
		panel.add(guest);
		panel.add(username);
		panel.add(usernameIcon);
		panel.add(usernameBar);
		panel.add(passwordIcon);
		panel.add(passwordBar);
		panel.add(email);
		panel.add(emailIcon);
		panel.add(emailBar);
		panel.add(signUpButton);
		panel.add(loginButton);
		panel.add(background);
		
		add(panel);
		
		validate();
		
	}
	
}
