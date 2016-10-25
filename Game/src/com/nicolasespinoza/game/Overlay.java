package com.nicolasespinoza.game;
	
import java.awt.Color;
	
import javax.swing.JFrame;
import javax.swing.JTextField;
	
public class Overlay extends JFrame {
	
	private static final long serialVersionUID = 8323080000663499840L;
	
	public Overlay() {
		
		// Ghost text: http://hastebin.com/ocijawecay.java
			
		setUndecorated(true);
		setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		setAlwaysOnTop(true);
		// Without this, the window is draggable from any non transparent
		// point, including points  inside textboxes.
		getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);
	
		getContentPane().setLayout(new java.awt.BorderLayout());
		getContentPane().add(new JTextField("text field north"), java.awt.BorderLayout.NORTH);
		getContentPane().add(new JTextField("text field south"), java.awt.BorderLayout.SOUTH);
		setVisible(true);
		pack();
	    
	}
		
}
