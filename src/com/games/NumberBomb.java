package com.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberBomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> enteredNumbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		System.out.println("Rules: YOU should not say the 'Bomb Number' From 1 to 20");
		System.out.println("Number Bomb is set!");
		Random rand = new Random();
		int bomb = rand.nextInt(20) + 1; // Generates a number from 1 to 20
		 // Generates a number from 1 to 20
		System.out.println("Pick a Number Between 1 to 20 .DONT pick the Bomb Number!");
		int pa = input.nextInt();
		System.out.println(bomb);
		int comp =0;
		for (int i = 1; pa != bomb || comp != bomb; i++) {
			Random rand1 = new Random();
			 comp = rand1.nextInt(20) + 1;
			if (comp == bomb || pa == bomb) {

			} else
				System.out.println("Pick a Number Between 1 to 20");

			pa = input.nextInt();
			if(enteredNumbers.contains(pa)) {
				System.out.println("You lost! Same Number Entered Twice");
				break;
			}
			enteredNumbers.add(pa);
			if(comp==bomb||pa==bomb) {
				
			}else	
			System.out.println("You are safe");
			if (comp == bomb || pa == bomb) {

			} else
				System.out.println("Computer is safe ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (comp == bomb || pa == bomb) {

			} else {
				System.out.println(" Computer's Turn:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(comp+"\n");
			}

		}
		if (comp == bomb) {
			System.out.println("Computer lost!");

		} else {
			System.out.println("Player lost!");

		}

	}

}