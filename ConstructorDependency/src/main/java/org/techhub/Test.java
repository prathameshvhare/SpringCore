package org.techhub;

public class Test {
	Player player;
	
	public Test(Player player) {
		this.player=player;
		System.out.println("Player Id:" + player.getId());
		System.out.println("Player Name:" + player.getName());
		System.out.println("Player Run:" + player.getRun());
		
		System.out.println("I am Default Constructor");
	}

}
