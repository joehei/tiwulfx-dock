package com.panemu.tiwulfx.control.dock;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Node;
import javafx.scene.control.Tab;

/**
 * @author amrullah
 */
public class DetachableTab extends Tab {
	private final BooleanProperty detachable = new SimpleBooleanProperty(true);

	public DetachableTab() {
	}

	public DetachableTab(String string) {
		super(string);
	}

	public DetachableTab(String text, Node content) {
		super(text, content);
	}

	public BooleanProperty detachableProperty() {
		return detachable;
	}

	public boolean isDetachable() {
		return detachable.get();
	}

	public void setDetachable(boolean detachable) {
		this.detachable.set(detachable);
	}
}
