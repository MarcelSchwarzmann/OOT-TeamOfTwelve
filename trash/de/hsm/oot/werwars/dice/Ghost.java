package de.hsm.oot.werwars.dice;

import java.io.FileNotFoundException;

public class Ghost extends Symbol {
	private static final long serialVersionUID = -3904420161528568227L;

	public Ghost(int value) throws FileNotFoundException {
		super(value,"symbol_ghost.png");
	}
}
