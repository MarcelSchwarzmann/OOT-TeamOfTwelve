package de.hsm.oot.werwars;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.rooms.Room;
import de.hsm.oot.werwars.suspects.Suspect;

public class Game {
	protected Clock clock; //the game has got a clock
	
	protected Board board; //the game has got a board
	protected List<Forage> forages; //the game has got a number of forages (for the different rooms)
	protected List<Animal> animals; //the game has got a number of animals (for the different rooms)
	protected List<Suspect> suspects; //the game has got a number of animals (for the different rooms)
	
	protected List<Room> rooms; //the game has got a specific set of rooms	
	
	protected Ghost ghost; //the game has got a ghost
	protected Player[] players; //the game has got one or multiple playsers
	
	public Game() throws IOException {		
		List<Forage.Sort> sorts = Arrays.asList(Forage.Sort.values());
		Collections.shuffle(sorts);
		this.forages = new ArrayList<Forage>();
		for(Forage.Sort sort:sorts)
			this.forages.add(new Forage(sort));
		
		Iterator<Forage.Sort> sort = sorts.iterator();
		this.animals = new ArrayList<Animal>();
		for(Animal.Race race:Animal.Race.values())
			if(sort.hasNext())
				this.animals.add(new Animal(race,sort.next()));
		
		List<Suspect.Function> functions = Arrays.asList(Suspect.Function.values());
		Collections.shuffle(functions);
		this.suspects = new ArrayList<Suspect>();
		for(Suspect.Function function:functions)
			this.suspects.add(new Suspect(function,functions.get(0).equals(function)));
		
		this.board = new Board(this);
	}
	
	public Board getBoard() { return board; }
	public List<Animal> getAnimals() { return animals; }
	public List<Suspect> getSuspects() { return suspects; }
	public List<Forage> getForages() { return forages; }
}
