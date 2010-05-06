package de.hsm.oot.werwars.dice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class SymbolTest {
	public static void main(String args[]) {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		try {
			frame.add(new Symbol(0));
			frame.add(new Symbol(1));
			frame.add(new Symbol(2));
			frame.add(new Symbol(3));
			frame.add(new Symbol(4));
			frame.add(new Symbol(5));
			frame.add(new Symbol(6));
			frame.add(new Symbol(7));
			frame.add(new Ghost(8));
		} catch(Exception e) {
			e.printStackTrace();
		}
		frame.setLocationByPlatform(true);
		frame.setSize(new Dimension(200,200));
		frame.setVisible(true);
	}
}