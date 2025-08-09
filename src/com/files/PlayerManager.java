package com.files;

import java.util.Scanner;

public class PlayerManager {

	public Player getPlayer() {
		Player player = new Player();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Player Name");
		player.setName(input.next());		
		return player;
	}
}
