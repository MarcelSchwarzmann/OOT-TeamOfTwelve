package de.hsm.oot.werwars.rooms;

import java.awt.Component;
import java.awt.Container;
import java.util.List;

import de.hsm.oot.werwars.Displayable;
import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.Person;
import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.RoomContainer;
import de.hsm.oot.werwars.rooms.doors.Door;
import de.hsm.oot.werwars.suspects.Chest;

public abstract class Room implements Displayable<RoomContainer> {
	protected Game game; //each room is used in one game
	protected Forage forage; //in each room there is a hidden forage
	protected Animal animal; //in each room there is an animal
	protected Chest chest; //in each room is a chest, which is owned by a suspect
	protected List<Room> connected; //each room is connected to other rooms
	protected List<Person> persons; //each room can hold several persons (ghost or players)
	protected List<Door> doors; //each room may have got several doors
	
	public Room(Game game,Chest chest) {
		this.game = game;
		this.chest = chest;
	}
	public Room(Game game,Forage forage,Chest chest) {
		this(game,chest);
		this.forage = forage;
	}
	public Room(Game game,Animal animal,Forage forage,Chest chest) {
		this(game,forage,chest);
		this.animal = animal;
	}
	
	public boolean hasAnimal() {
		return this.animal!=null;
	}
	public Animal getAnimal() {
		return this.animal;
	}
	
	public boolean hasForage() {
		return this.forage!=null;
	}
	public Forage getForage() {
		return this.forage;
	}
	public Chest getChest() {
		return this.chest;
	}
	
	public abstract RoomContainer getComponent();
}
