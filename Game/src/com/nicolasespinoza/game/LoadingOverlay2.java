package com.nicolasespinoza.game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoadingOverlay2 extends JFrame {

	private static final long serialVersionUID = 177074623740109565L;

	private JLabel loadingIcon = null;
	
	public LoadingOverlay2(int scWidth, int scHeight, double scLocX, double scLocY) {
		
		loadingIcon = new JLabel(new ImageIcon(getClass().getResource("/resources/loadingCircle.gif")));
		
//		setBackground(Color.BLUE);
//		setForeground(Color.BLUE);
		getContentPane().setBackground(new Color(107, 205, 255));
		setUndecorated(true);
		setOpacity(0.8f);
		setSize(scWidth, scHeight);
		setLocation((int) scLocX, (int) scLocY + 22);
		setAlwaysOnTop(true);
		
		add(loadingIcon);
		validate();
		
		setVisible(true);
		
	}
	
}
