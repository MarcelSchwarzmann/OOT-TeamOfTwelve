package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import de.hsm.oot.werwars.rooms.Room;

public class RoomContainer extends Container {
	private Room room;
	
	private AnimalComponent animal;
	private ChestComponent chest;
	
	public RoomContainer(Room room) {
		this.room = room;
		this.setLayout(null); //null layout
		this.add(new Label("Test"));
		if(room.hasAnimal())
			this.add(animal=room.getAnimal().getComponent());
		this.add(chest=room.getChest().getComponent());
	}
	public RoomContainer(final Room room,Point location,Dimension size) {
		this(room);
		this.setLocation(location);
		this.setSize(size);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent) {
				//TODO: Remove this line
				System.out.println("You clicked on the "+room.getClass().getSimpleName());
			}
			public void mouseEntered(MouseEvent mouseevent) {
				//TODO: Remove this line
				System.out.println("Your mouse entered the "+room.getClass().getSimpleName());							
			}
			public void mouseExited(MouseEvent mouseevent) {
				//TODO: Remove this line
				System.out.println("Your mouse left the "+room.getClass().getSimpleName());
			}
		});
	}
	public void paint(Graphics g) {
		//TODO: Remove the next two lines
		g.setColor(Color.RED);
		g.drawRect(0,0,getWidth()-1,getHeight()-1);
		super.paint(g);
	}
}
