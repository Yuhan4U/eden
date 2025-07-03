package com.games;

import java.util.Random;
import java.util.Scanner;

public class RockPapperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
	        int randomNumber = rand.nextInt(3) + 1; // Generates 1, 2, or 3
	        Scanner input = new Scanner(System.in);
			System.out.println("Lets play stone papper scissor");
	    String mark=    input.nextLine();
	    if(randomNumber==1) {
	    	System.out.println(" Stone");
	    
	    } if(randomNumber==2) {
	    	System.out.println(" Papper");
	    
	    } if(randomNumber==3) {
	    	System.out.println(" Scissor");
	    
	    }
}
}
