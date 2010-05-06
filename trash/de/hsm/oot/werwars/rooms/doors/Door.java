package de.hsm.oot.werwars.rooms.doors;

import de.hsm.oot.werwars.rooms.Room;

public abstract class Door {
	//each door connects two rooms
	private Room from; //first room this door is connected with
	private Room to; //second room this door is connected with
}
