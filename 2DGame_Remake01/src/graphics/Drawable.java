package graphics;

import java.awt.Color;
import java.awt.Rectangle;

/*
 * 
 * EVERYTHING IS A RECTANGLE PLEASE
 */
public interface Drawable {

	public Rectangle getRect();
	public boolean isRemovable();
	public Color getColor();
	
}
