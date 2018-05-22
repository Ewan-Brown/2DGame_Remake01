package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	//ADD SUPPORT FOR SCALING?
	public static ArrayList<Drawable> drawables = new ArrayList<>();
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g; //Might not need this but whatever
		for(Drawable d : drawables){
			g2.setColor(d.getColor());
			g2.fill(d.getRect());
		}
	}
	
}
