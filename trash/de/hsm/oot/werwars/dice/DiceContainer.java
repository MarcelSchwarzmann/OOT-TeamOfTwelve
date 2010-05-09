package de.hsm.oot.werwars.dice;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

public class DiceContainer extends Container {
	private static final long serialVersionUID = 7422066262826380745L;
	
	private Component visible;
	public DiceContainer(Dice dice) {
		this.setLayout(null);
		this.setSize(new Dimension(50,50));
		this.setPreferredSize(new Dimension(50,50));
		
		for(Symbol symbol:dice.symbols) {
			symbol.setVisible(false);
			this.add(symbol);
		}
		new Thread(new Runnable() {
			public void run() {
				for(int rolls=0;rolls<15;rolls++,roll())
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {}
			}
		}).start();
	}
	
	public void roll() {
		if(visible!=null)
			visible.setVisible(false);
		(visible = getComponent((int)(Math.random()*getComponentCount()))).setVisible(true);
		this.repaint();
	}
}
