package de.hsm.oot.werwars.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.animals.Animal;

public class AnimalComponent extends Component {
	private static final long serialVersionUID = -1353845368845490621L;
	
	protected Animal animal;
	
	public AnimalComponent(Animal animal) {
		this.animal = animal;
		this.setLocation(new Point(0,0));
		this.setSize(new Dimension(50,70));
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
