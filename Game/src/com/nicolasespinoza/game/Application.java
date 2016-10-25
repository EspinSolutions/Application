package com.nicolasespinoza.game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application extends JFrame {

	private static final long serialVersionUID = -6402189418598622274L;
	
	private JLabel infoBar = new JLabel();
	private JLabel infoUsername = new JLabel();

	private Font generalFont = new Font("Futura", Font.PLAIN, 16);
	
	public Application() {
		
		// Original: 52, 73, 94
		
		setSize(1000, 750);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(45, 48, 55));
		setTitle("Game");
		setName("Game");
		
		setLayout(null);
		
		infoBar.setIcon(new ImageIcon(getClass().getResource("/resources/infoBar.png")));
		infoBar.setBounds(0, 0, 1000, 30);
		infoBar.setBorder(null);
		infoUsername.setText(new GameAPI().getUsername().toUpperCase());
		infoUsername.setFont(generalFont);
		infoUsername.setForeground(Color.WHITE);
		infoUsername.setBounds(850, 6, 200, 20);
		infoUsername.setBorder(null);
		
		add(infoUsername);
		add(infoBar);
		
		setVisible(true);
		
	}
	
}
