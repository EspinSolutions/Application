package com.nicolasespinoza.game;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class TranslucentPane extends JPanel {

	private static final long serialVersionUID = -1263764712435938015L;

	public TranslucentPane() {
		
        setOpaque(false);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
    	
        super.paintComponent(g); 

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.85f));
//        g2d.setColor(getBackground());
        g2d.setColor(new Color(57, 205, 249));
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
    }
	
}
