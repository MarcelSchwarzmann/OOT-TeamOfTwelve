package de.hsm.oot.werwars;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.BoardContainer;
import de.hsm.oot.werwars.rooms.Armory;
import de.hsm.oot.werwars.rooms.Church;
import de.hsm.oot.werwars.rooms.Dungon;
import de.hsm.oot.werwars.rooms.Kitchen;
import de.hsm.oot.werwars.rooms.Lobby;
import de.hsm.oot.werwars.rooms.Nursery;
import de.hsm.oot.werwars.rooms.Room;
import de.hsm.oot.werwars.rooms.Smithy;
import de.hsm.oot.werwars.rooms.Stable;
import de.hsm.oot.werwars.rooms.Throneroom;
import de.hsm.oot.werwars.rooms.Tower;
import de.hsm.oot.werwars.suspects.Suspect;

public class Board implements Displayable<Container> {
	private Game game; //this board is used in a specific game
	private List<Room> rooms; //the board has got several rooms
	
	public Board(Game game) {
		this.game = game;
		this.rooms = new ArrayList<Room>();
		initializeRooms();
	}
	
	protected void initializeRooms() {
		Iterator<Suspect> suspect = game.getSuspects().iterator();
		Iterator<Animal> animal = game.getAnimals().iterator();
		Iterator<Forage> forage = game.getForages().iterator();
		this.rooms.add(new Armory(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Church(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Dungon(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Kitchen(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Lobby(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Smithy(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Stable(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Throneroom(game,animal.next(),forage.next(),suspect.next().getChest()));
		this.rooms.add(new Tower(game,animal.next(),forage.next(),suspect.next().getChest()));
		//TODO: May randomize the forage here (does the nursery have an hidden forage?)
		this.rooms.add(new Nursery(game,suspect.next().getChest()));
	}
	
	public Container getComponent() {
		return new BoardContainer(this);
	}
	
	public Game getGame() {
		return this.game;
	}
	public List<Room> getRooms() {
		return this.rooms;
	}
}
