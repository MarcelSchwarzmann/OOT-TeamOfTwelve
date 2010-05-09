package de.hsm.oot.werwars.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.suspects.Chest;

public class ChestComponent extends Component {
	private static final long serialVersionUID = 7510670759733308695L;
	
	protected Chest chest;
	
	public ChestComponent(Chest chest) {
		this.chest = chest;
		this.setLocation(new Point(0,0));
		this.setSize(new Dimension(72,48));
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		try {
			g.drawImage(Guitilities.createImageIcon("chest.png").getImage(),0,0,getWidth()-1,getHeight()-1,this);
			g.drawImage(chest.getOwner().getIcon().getImage(),getWidth()/2-18,2,32,32,this);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			super.paint(g);
		}		
	}
}
