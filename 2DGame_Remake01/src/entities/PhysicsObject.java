package entities;

import java.awt.Rectangle;

import graphics.Drawable;

public abstract class PhysicsObject implements Drawable {

	public PhysicsObject(double x, double y, double wi, double h, double wgt) {
		this.x = x + wi / 2;
		this.y = y + h / 2;
		this.width = wi;
		this.height = h;
		this.weight = wgt;
	}

	public double xSpeed;
	public double ySpeed;
	public double weight;
	public static double FRICTION_COEFF = 20;

	public double x; // ****************************
	public double y; // Represent center of rectangle

	public double width;
	public double height;

	// TODO Maybe a getHeight+getWidth for generic calls AND dynamic variables?
	// (All entites are same size but some walls are random sizes...)
	public void update() {
		x += xSpeed;
		y += ySpeed;
		xSpeed -= (xSpeed/FRICTION_COEFF) * weight;
		
	}

	public void applyForce(double ap, double angle, boolean external) {
		if ((!external && canThrust) || external && canBePushed) {
			// TODO Wow this is terrible please figure out bitmask
			double vX = ap * Math.cos(angle);
			double vY = ap * Math.sin(angle);
			xSpeed += vX / weight;
			ySpeed += vY / weight;
		}
	}

	public Rectangle getRect() {
		return new Rectangle((int) (x - width / 2), (int) (y - height / 2), (int) width, (int)height);
	}

	boolean canBePushed = true;
	boolean canThrust = false;

	enum CollisionType { // TODO Remove this and replace with mask
		NONE, ENTITY, WALL
	}

	// XXX Use a bitmask here? optimize + ease of use or too complicated?
	byte collisionBitMask = 0;
	
	// Somehow attach these to "obj.getByteMask"???
	static final byte COLLIDE_ENTITY = 0b1000000;
	static final byte COLLIDE_WALL = 0b0100000; 
	static final byte COLLIDE_BULLET = 0b0010000;
	
	
}
