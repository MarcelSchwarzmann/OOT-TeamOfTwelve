package de.hsm.oot.werwars.forages;

import java.io.FileNotFoundException;

import javax.swing.ImageIcon;

import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.Iconfiable;

public class Forage implements Iconfiable {
	private static final long serialVersionUID = -5587520160974901623L;
	
	public enum Sort {
		APPLE,BREAD,CARROT,CHEESE,CHERRYS,GRAPES,MUSHROOMS,NUTS,PEAR;
		private String icon;
		private Sort() { this(null); }
		private Sort(String icon) {
			StringBuilder build = new StringBuilder();
			if(!(icon instanceof String))
				icon = this.toString();
			build.append(icon);
			if(!icon.endsWith(".png"))
				build.append(".png");
			this.icon = build.toString();
		}
		public String toString() {
			return super.toString().toLowerCase();
		}
		public String getIcon() {
			return this.icon;
		}
	}
	
	protected Sort sort;
	
	public Forage(Sort sort) {
		this.sort = sort;
	}
	
	public ImageIcon getIcon() throws FileNotFoundException {
		return Guitilities.createImageIcon(sort.getIcon());
	}
}
