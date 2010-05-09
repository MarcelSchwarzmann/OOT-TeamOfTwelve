package de.hsm.oot.werwars.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Label;
import java.io.FileNotFoundException;

import de.hsm.oot.werwars.Board;
import de.hsm.oot.werwars.Guitilities;
import de.hsm.oot.werwars.rooms.Room;

public class BoardContainer extends Container {
	private Board board;
	public BoardContainer(Board board) {
		this.board = board;
		this.setLayout(null); //null layout
		for(Room room:board.getRooms())
			this.add(room.getComponent());
	}
	
	public void paint(Graphics g) {
		try {
			g.drawImage(Guitilities.createImageIcon("board.png").getImage(),0,0,this.getWidth(),this.getHeight(),Color.WHITE,this);
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			super.paint(g);
		}		
	}
}
