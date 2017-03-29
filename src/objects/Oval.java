package objects;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GObject {

	private Color color;
	
	public Oval(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void paintObject(Graphics g) {
		// TODO: Implement this method.
	}
	
	@Override
	public void paintLabel(Graphics g) {
		// TODO: Implement this method.
	}
	
}
