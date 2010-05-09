package de.hsm.oot.werwars.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import de.hsm.oot.werwars.rooms.Room;

public class RoomContainer extends Container {
	private static final long serialVersionUID = -5905590249572494650L;

	protected Room room;
	
	private AnimalComponent animal;
	private ChestComponent chest;
	
	public RoomContainer(Room room) {
		this.room = room;
		this.setLayout(null); //null layout
		this.add(chest=room.getChest().getComponent());
		if(room.hasAnimal())
			this.add(animal=room.getAnimal().getComponent());
	}
	public RoomContainer(final Room room,Point location,Dimension size) {
		this(room);
		this.setLocation(location);
		this.setSize(size);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent) { //clicked on the room
				//TODO: Add some content
			}
			public void mouseEntered(MouseEvent mouseevent) { //entered the room
				//TODO: Add some content							
			}
			public void mouseExited(MouseEvent mouseevent) { //left the room
				//TODO: Add some content
			}
		});
	}
	public RoomContainer(final Room room,Point location,Dimension size,Point animal_location,Point chest_location) {
		this(room,location,size);
		if(animal!=null)
			animal.setLocation(animal_location);
		chest.setLocation(chest_location);
	}
	
	public void paint(Graphics g) {
		//TODO: Remove the next two lines
		//g.setColor(Color.RED);
		//g.drawRect(0,0,getWidth()-1,getHeight()-1);
		super.paint(g);
	}
}
