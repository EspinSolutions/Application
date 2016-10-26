package com.espinsolutions.application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Utils {
	
	static boolean repeatBoolean = true;
	
	public static void setDynaticBackground(JFrame window, ImageIcon image1, ImageIcon image2, ImageIcon image3, int interval) {
		
		Timer timer = new Timer(interval, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Changing background!");
				
				window.getContentPane().setBackground(Color.BLACK);
				
			}
			
		});
		
		timer.setRepeats(true);
		timer.start(); 
		
	}
	
	public static void moveButton(JButton button, int xAfter, int yAfter) {
		
		System.out.println(button.getBounds().x + " " + button.getBounds().y + " " + button.getBounds().width + " " + button.getBounds().height);
		System.out.println(button.getLocation().x + " " + button.getLocation().y);
		
		Timer timer = new Timer(5, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				@SuppressWarnings("unused")
				int y = 0;
				int x = 0;
			
				x++;
				y++;
				
				if (button.getLocation().x != xAfter || button.getLocation().y != yAfter) {
			
					button.setBounds(button.getBounds().x + x, button.getBounds().y, button.getBounds().width, button.getBounds().height);
					
				} else {
					
					repeatBoolean = false;
					
				}
				
			}
			
		});
		
		timer.setRepeats(repeatBoolean);
		timer.start(); 
		
	}
	
}
