package de.hsm.oot.werwars.rooms.doors;

import de.hsm.oot.werwars.Displayable;
import de.hsm.oot.werwars.gui.DoorComponent;
import de.hsm.oot.werwars.rooms.Room;

public class Door implements Displayable<DoorComponent> {
	//each door connects two rooms
	protected Room from; //first room this door is connected with
	protected Room to; //second room this door is connected with
	protected boolean opened;
	
	public DoorComponent getComponent() {
		return null;
	}
}
