package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import de.hsm.oot.werwars.dice.Dice;
import de.hsm.oot.werwars.dice.Symbol;

public class DiceContainer extends Container {
	private static final long serialVersionUID = 7422066262826380745L;
	
	private Component visible;
	public DiceContainer(Dice dice) {
		this.setLayout(null);
		this.setSize(new Dimension(50,50));
		this.setPreferredSize(new Dimension(50,50));
		for(Symbol symbol:dice.symbols) {
			this.add(symbol);
			symbol.setVisible(false);
		}
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				new Thread(new Runnable() {
					public void run() {
						for(int rolls=0;rolls<15;rolls++,roll())
							try {
								Thread.sleep(rolls*25);
							} catch (InterruptedException e) {}
						System.out.println("You rolled a "+((Symbol)visible).toString());							
					}
				}).start();
			}
		});
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.GRAY); g.drawRect(1,1,this.getWidth()-3,this.getHeight()-3);
		g.setColor(Color.BLACK);g.drawRect(0,0,this.getWidth()-1,this.getHeight()-1);
		super.paint(g);
	}
	
	public void roll() {
		if(visible!=null)
			visible.setVisible(false);
		(visible = getComponent((int)(Math.random()*getComponentCount()))).setVisible(true);
		this.repaint();
	}
}
