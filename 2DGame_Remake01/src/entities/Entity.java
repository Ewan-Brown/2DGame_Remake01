package entities;

import java.awt.Color;
import java.awt.Rectangle;

import org.w3c.dom.css.Rect;

/*
 * 
 * For things with health!
 */
 public class Entity extends PhysicsObject{

	int health;
	int maxHealth;
	boolean isDead = false;
	public Entity(double x, double y, double w, double h){
		super(x, y, w, h,1);
		
	}

	@Override
	public Color getColor() {
		return Color.BLUE;
	}

	@Override
	public boolean isRemovable() {
		return isDead;
	}
	
}
