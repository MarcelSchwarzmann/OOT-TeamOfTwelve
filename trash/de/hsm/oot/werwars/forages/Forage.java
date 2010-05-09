package de.hsm.oot.werwars.forages;

import java.io.FileNotFoundException;

import javax.swing.ImageIcon;

import de.hsm.oot.werwars.Guitilities;

public class Forage {
	public enum Sort {
		APPLE,BREAD,CARROT,CHEESE,CHERRYS,GRAPES,MUSHROOMS,NUTS,PEAR;
		private String image;
		private Sort() { this(null); }
		private Sort(String image) {
			StringBuilder build = new StringBuilder();
			if(!(image instanceof String))
				image = this.toString();
			if(!image.endsWith(".png"))
				build.append(".png");
			this.image = build.toString();
		}
		public String getImage() {
			return this.image;
		}
	}
	
	private String name; //the name of the forage
	private ImageIcon graphic; //the graphic represntation of the forage
	
	public Forage(Sort sort) {}
	protected Forage(String name,ImageIcon graphic) {
		this.name = name;
		this.graphic = graphic;
	}
	
	protected static ImageIcon getIcon(String name) throws FileNotFoundException {
		return Guitilities.createImageIcon(new StringBuilder("forages/").append(name).toString());
	}
}
