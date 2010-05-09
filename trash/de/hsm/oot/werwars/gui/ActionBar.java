package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.dice.Dice;

public class ActionBar extends Container {
	public ActionBar(Game game,Dice dice) {
		setPreferredSize(new Dimension(0,100));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//TODO: remove next two lines
		g.setColor(Color.GRAY);
		g.fillRect(0,0,this.getWidth(),this.getHeight());
	}
}
