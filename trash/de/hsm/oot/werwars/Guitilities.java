package de.hsm.oot.werwars;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class Guitilities {
	private static HashMap<String,ImageIcon> images = new HashMap<String,ImageIcon>();
	
	public static Dimension getScreenSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
	public static Point centerWithin(Rectangle parentBounds, Dimension size, Dimension screenSize) {
		int cx = parentBounds.x + parentBounds.width / 2;
		int cy = parentBounds.y + parentBounds.height / 2;
		cx -= size.width / 2;
		cy -= size.height / 2;
		if (cx < 0) cx = 0;
		if (cy < 0) cy = 0;
		if (cx + size.width > screenSize.width) cx = screenSize.width - size.width;
		if (cy + size.height > screenSize.height) cy = screenSize.height - size.height;
		return new Point(cx, cy);
	}
	public static ImageIcon createImageIcon(String image) throws FileNotFoundException {
		StringBuilder path = new StringBuilder();
		if(!image.startsWith("/")) path.insert(0,'/');
		if(!image.startsWith("/resources/"))
			path.insert(1,"resources/werwars/images/");
		if(!images.containsKey(path.append(image).toString()))
			try {
				images.put(path.toString(),new ImageIcon(Guitilities.class.getResource(path.toString())));			
			} catch(NullPointerException e) {
				throw new FileNotFoundException(new StringBuilder("Image/icon ").append(image).append(" was not found.").toString());
			}
		return images.get(path.toString());
	}
	public static ImageIcon createImageIcon(String image, String description) throws FileNotFoundException {
		ImageIcon icon = createImageIcon(image);
		icon.setDescription(description);
		return icon;
	}
}
