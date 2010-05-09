package de.hsm.oot.werwars;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.io.IOException;

import de.hsm.oot.werwars.dice.Dice;
import de.hsm.oot.werwars.gui.ActionBar;

public class Gamemaster implements Displayable<Frame> {
	private Game game; //the gamemaster is the master of the game
	private Dice dice; //and holds the dice
	private Player player; //and has got a player which is currently on turn
	
	public Gamemaster() throws IOException {
		game = new Game();
		dice = new Dice();		
	}

	public Frame getComponent() {
		Frame frame = new Frame("Wer war's?");
		frame.setLayout(new BorderLayout());
		frame.add(game.getBoard().getComponent(),BorderLayout.CENTER);
		frame.add(new ActionBar(game,dice),BorderLayout.SOUTH);
		frame.setSize(new Dimension(800,600));
		return frame;
	}
	
	public static void main(String args[]) throws IOException {
		Gamemaster gamemaster = new Gamemaster();
		gamemaster.getComponent().setVisible(true);
	}
}
