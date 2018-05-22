package game;

import java.util.ArrayList;

import entities.Entity;

//Should this really be abstract what are you doing / So i dont accidentally instantiate???
public abstract class Game {

	public static ArrayList<Entity> entityArray = new ArrayList<Entity>();
	
	public static void update(){
		//Keep track of collisions on first run then cull and check then have second stage physics where things are corrected.
		for(int i = 0; i < entityArray.size();i++){
			
		}
	}
}
