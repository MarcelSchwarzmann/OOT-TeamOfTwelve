package de.hsm.oot.werwars;

import java.awt.Component;

public interface Displayable<Type extends Component> {
	public Type getComponent();
}
