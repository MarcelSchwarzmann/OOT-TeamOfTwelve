package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.hsm.oot.werwars.rooms.Room;
import de.hsm.oot.werwars.suspects.Chest;

public class ChestComponent extends Container {

	public ChestComponent(Room room,Chest chest) {
		this.setSize(new Dimension(10,10));
		this.setLocation(new Point(10,10));
	}

	public void print(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(0,0,getWidth()-1,getHeight()-1);
		g.drawString("Chest",10,10);
		super.print(g);
	}
}
