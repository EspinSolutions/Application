package com.nicolasespinoza.game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class LoginScreen extends JFrame {
	
	private static final long serialVersionUID = -6620579283760105923L;
	
	private JPanel panel = new JPanel();
	
	private JLabel usernameIcon = new JLabel();
	private JLabel usernameBar = new JLabel();
	private JLabel passwordIcon = new JLabel();
	private JLabel passwordBar = new JLabel();
	private JLabel background = new JLabel();
	private JLabel logo = new JLabel();
	
	private JButton loginButton = new JButton();
	private JButton signUpButton = new JButton();
	
	private JTextComponent username = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	
	public LoginScreen() {
		
		try {
			
			setIconImage(ImageIO.read(getClass().getResource("/resources/favicon.png")));
			
		} catch (IOException e) {
		  		
		  	e.printStackTrace();
		  		
		}
		
		setSize(1015, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(52, 73, 94));
		setTitle("Game | Login or Sign Up");
		setName("Game | Login or Sign Up");
		
		background.setIcon(new ImageIcon(getClass().getResource("/resources/mountain-test.jpeg")));
		background.setBorder(null);
		background.setBounds(-80, 0, 1100, 700);
		
		logo.setIcon(new ImageIcon(getClass().getResource("/resources/logo.png")));
		logo.setBorder(null);
		logo.setBounds(350, 200, 306, 100);
		
		username.setBorder(null);
		username.setBounds(405, 353, 230, 20);
		HintText usernameHint = new HintText("Username", username);
		usernameHint.changeAlpha(150);
		usernameIcon.setIcon(new ImageIcon(getClass().getResource("/resources/usernameIcon.png")));
		usernameIcon.setBorder(null);
		usernameIcon.setBounds(380, 350, 25, 25);
		usernameBar.setIcon(new ImageIcon(getClass().getResource("/resources/textBar.png")));
		usernameBar.setBorder(null);
		usernameBar.setBounds(375, 340, 265, 44);
		
		passwordIcon.setIcon(new ImageIcon(getClass().getResource("/resources/passwordIcon.png")));
		passwordIcon.setBorder(null);
		passwordIcon.setBounds(380, 420, 25, 25);
		passwordBar.setIcon(new ImageIcon(getClass().getResource("/resources/textBar.png")));
		passwordBar.setBorder(null);
		passwordBar.setBounds(375, 410, 265, 44);
		passwordField.setBorder(null);
		passwordField.setBounds(405, 423, 230, 20);
		passwordField.setEchoChar('•');
		HintText passwordHint = new HintText("Password", passwordField);
		passwordHint.changeAlpha(150);
		
		signUpButton.setIcon(new ImageIcon(getClass().getResource("/resources/signUpButton.png")));
		signUpButton.setBorder(null);
		signUpButton.setBounds(390, 480, 107, 34);
		
		loginButton.setIcon(new ImageIcon(getClass().getResource("/resources/loginButton.png")));
		loginButton.setBorder(null);
		loginButton.setBounds(515, 480, 107, 34);
		
		panel.setLayout(null);
		
		panel.add(passwordField);
		panel.add(logo);
		panel.add(username);
		panel.add(usernameIcon);
		panel.add(usernameBar);
		panel.add(passwordIcon);
		panel.add(passwordBar);
		panel.add(signUpButton);
		panel.add(loginButton);
		panel.add(background);
		
		add(panel);
		
		validate();
		
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (username.getText() != null && passwordField != null) {
						
					GameAPI.username = username.getText();
						
					new Application();
						
					panel.setVisible(false);
					dispose();
						
				}
				
			}
			
		});
		
		signUpButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				SignUpScreen signUpScreen = new SignUpScreen();
				signUpScreen.setName("Game | Sign Up");
				signUpScreen.setVisible(true);
				
				panel.setVisible(false);
				dispose();
				
			}
			
		});
		
		passwordField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (username.getText() != null && passwordField != null) {
						
					GameAPI.username = username.getText();
						
					new Application();
						
					panel.setVisible(false);
					dispose();
						
				}
				
				
			}
			
		});
		
		// for future loading screen, once ready, boolean isReady = true
		setVisible(true);
		
	}
	
}
