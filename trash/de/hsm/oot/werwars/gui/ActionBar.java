package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.dice.Dice;
import de.hsm.oot.werwars.dice.DiceContainer;

public class ActionBar extends Container {
	private static final long serialVersionUID = 3163022956124019680L;
	
	protected Game game;
	protected Dice dice;
	
	public ActionBar(Game game,Dice dice) {
		this.game = game;
		this.dice = dice;
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(0,100));
		this.add(new DiceContainer(dice));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
}
