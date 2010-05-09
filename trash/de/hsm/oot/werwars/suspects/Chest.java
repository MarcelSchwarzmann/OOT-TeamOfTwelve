package de.hsm.oot.werwars.suspects;

import de.hsm.oot.werwars.Displayable;
import de.hsm.oot.werwars.gui.ChestComponent;

public class Chest implements Displayable<ChestComponent> {
	public final boolean containsRing; //the chest could contain a ring or nothing
	
	protected Suspect owner; //is owned by one suspect
	protected boolean opened; //inicates if the chest was already opened
	
	public Chest(Suspect owner,boolean containsRing) {
		this.owner = owner;
		this.containsRing = containsRing;
	}
	
	public ChestComponent getComponent() {
		return new ChestComponent(this);
	}
	
	public Suspect getOwner() {
		return owner;
	}
}
