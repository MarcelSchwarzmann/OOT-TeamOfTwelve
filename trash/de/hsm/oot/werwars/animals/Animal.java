package de.hsm.oot.werwars.animals;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Properties;

import de.hsm.oot.werwars.Displayable;
import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.Utilities;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.AnimalComponent;

public class Animal implements Displayable<AnimalComponent> {
	public enum Race {
		BOAR,DOG,DONKEY,DRAGON,GOAT,HORSE,OWL,PEACOCK,SNAKE;
		private String properties;
		private Race() { this(null); }
		private Race(String properties) {
			StringBuilder build = new StringBuilder();
			if(!(properties instanceof String))
				properties = this.toString().toLowerCase();
			build.append(properties);
			if(!properties.endsWith(".animal"))
				build.append(".animal");
			this.properties = build.toString();
		}
		public String getProperties() {
			return this.properties;
		}
	}
	
	public final Properties properties;
	
	private Race race; //an animal is of a specific race
	private Forage.Sort forage; //an animals likes a specific forage
	private boolean gaveHint; //an animals gives a hint exactly once
	
	public Animal(Race race,Forage.Sort forage) throws IOException {
		this.race = race;
		this.forage = forage;
		this.properties = Utilities.loadProperties(race.getProperties());
		if(!this.properties.containsKey("image"))
			throw new IOException("Animal properties for "+race.toString().toLowerCase()+" are not acceptable.");
	}
	
	public AnimalComponent getComponent() {
		return new AnimalComponent(this);
	}
}