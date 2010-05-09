package de.hsm.oot.werwars.suspects;

import java.awt.Component;

import de.hsm.oot.werwars.Displayable;
import de.hsm.oot.werwars.gui.ChestComponent;

public class Chest implements Displayable<ChestComponent> {
	private Suspect suspect; //is owned by one suspect
	private boolean containsRing; //the chest could contain a ring or nothing
	public Chest(Suspect owner,boolean containsRing) {
	
	}
	
	public ChestComponent getComponent() {
		return new ChestComponent(null, null);
	}
}
