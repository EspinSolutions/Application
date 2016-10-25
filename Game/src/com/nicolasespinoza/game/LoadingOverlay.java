package com.nicolasespinoza.game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadingOverlay extends JFrame {

	private static final long serialVersionUID = -8910639080827925544L;

	int scWidth;
	int scHeight;
	
	int scLocX;
	int scLocY;
	
	JPanel panel;
	
	public void addLoadingIcon() {
		
		JLabel image = null;
		image = new JLabel(new ImageIcon(getClass().getResource("/resources/loadingCircle.gif")));
		add(image);
		validate();
		
	}
	
	public LoadingOverlay() {
		
		setUndecorated(true);
		setAlwaysOnTop(true);
		setSize(scWidth, scHeight);
		setLocation(scLocX, scLocY);
		
        setBackground(new Color(0,0,0,0));
        setContentPane(new TranslucentPane());
//        setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		addLoadingIcon();
		
		panel = new TranslucentPane();
		
		getContentPane().add(panel);
		
        pack();
        setVisible(true);
		
	}
	
}
