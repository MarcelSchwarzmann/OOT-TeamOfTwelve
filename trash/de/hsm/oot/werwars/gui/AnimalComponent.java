package de.hsm.oot.werwars.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.animals.Animal;

public class AnimalComponent extends Component {
	private Animal animal;
	
	public AnimalComponent(Animal animal) {
		this.animal = animal;
		this.setLocation(new Point(5,5));
		this.setSize(new Dimension(20,20));
	}
	
	public void paint(Graphics g) {
		try {
			g.drawImage(Guitilities.createImageIcon(animal.properties.getProperty("image")).getImage(),0,0,this.getWidth(),this.getHeight(),this);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			super.paint(g);
		}
	}
}
