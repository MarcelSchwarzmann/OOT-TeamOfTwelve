package de.hsm.oot.werwars.rooms;

import java.awt.Dimension;
import java.awt.Point;

import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.RoomContainer;
import de.hsm.oot.werwars.suspects.Chest;

public class Nursery extends Room {
	public Nursery(Game game, Chest chest) {
		super(game, chest);
	}
	public Nursery(Game game, Forage forage, Chest chest) {
		super(game, forage, chest);
	}

	public RoomContainer getComponent() {
		return new RoomContainer(this,new Point(405,30),new Dimension(125,120),
        													new Point(30,30),new Point(25,30));
	}
}
