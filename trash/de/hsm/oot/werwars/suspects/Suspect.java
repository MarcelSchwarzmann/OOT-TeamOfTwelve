package de.hsm.oot.werwars.suspects;

import java.io.IOException;

import javax.swing.ImageIcon;

import de.hsm.oot.Imagable;
import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.Iconfiable;


public class Suspect implements Imagable, Iconfiable {
	public enum Function {
		BLACKSMITH,CHARWOMAN,COOK,DAMSEL,GUARD,KNIGHT,NANNY,PRIEST,STABLEBOY,WITCH;
		private String image,icon;
		private Function() { this(null); }
		private Function(String image) { this(image,null); }
		private Function(String image,String icon) {
			StringBuilder build = new StringBuilder();
			if(!(image instanceof String)||image.isEmpty())
				image = this.toString();
			build.append(image);
			if(!image.endsWith(".png"))
				build.append(".png");
			this.image = build.insert(0,"suspects/").toString();
			this.icon = build.insert(9,"icons/").toString();
		}
		public String toString() { return super.toString().toLowerCase(); }
		public String getImage() { return this.image;	}
		public String getIcon() { return this.icon; }
	}
	
	public final boolean stoleRing;
	
	private Function function;
	private Chest chest; //each suspect has got a chest
	
	public Suspect(Function function) { this(function,false); }
	public Suspect(Function function,boolean stoleRing) {
		this.function = function;
		this.stoleRing = stoleRing;
		this.chest = new Chest(this,stoleRing);
	}
	
	public Chest getChest() { return chest; }
	
	public ImageIcon getImage() {
		return null;
	}

	public ImageIcon getIcon() throws IOException {
		return Guitilities.createImageIcon(function.getIcon());
	} 
}
