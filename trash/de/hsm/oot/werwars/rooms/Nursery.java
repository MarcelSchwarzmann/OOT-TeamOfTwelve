package de.hsm.oot.werwars.rooms;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.RoomContainer;
import de.hsm.oot.werwars.suspects.Chest;

public class Nursery extends Room {
	public Nursery(Game game, Chest chest) {
		super(game, chest);
		// TODO Auto-generated constructor stub
	}
	public Nursery(Game game, Forage forage, Chest chest) {
		super(game, forage, chest);
		// TODO Auto-generated constructor stub
	}

	public RoomContainer getComponent() {
		return new RoomContainer(this,new Point(405,30),new Dimension(125,120));
	}

}
