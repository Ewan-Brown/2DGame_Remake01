package entities;

import java.awt.Color;

/**
 * @author Ewan
 * For particles!
 * Handled very separately from entities please health /=/ life
 */
public class Particle extends PhysicsObject{

	double life;
	double maxLife;
	public Particle(double x, double y, double w, double h) {
		super(x, y, w, h,1);
	}
	@Override
	public Color getColor() {
		return Color.ORANGE;
	}
	@Override
	public boolean isRemovable() {
		return life < 0;
	}

	
	
}
