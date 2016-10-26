package com.espinsolutions.application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class LoadingScreen extends JFrame {
	
	private static final long serialVersionUID = 3541398758603678832L;
	private JLabel loadingCircle = null;
		
	public LoadingScreen(int duration) {
		
		loadingCircle = new JLabel(new ImageIcon(getClass().getResource("/resources/loadingCircle.gif")));
		
		try {
			
			setIconImage(ImageIO.read(getClass().getResource("/resources/favicon.png")));
			
		} catch (IOException e) {
		  		
		  	e.printStackTrace();
		  		
		}
		
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(45, 48, 55));
		setTitle("Game | Loading...");
		setName("Game | Loading...");
		
		add(loadingCircle);
		validate();
		
		setVisible(true);
		
		Timer timer = new Timer(duration, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new LoginScreen();
				
				dispose();
				
			}
			
		});
		
		timer.setRepeats(false);
		timer.start(); 
		
	}
	
}
