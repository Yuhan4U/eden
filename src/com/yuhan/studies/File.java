package com.yuhan.studies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class File {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("names.txt");
		Scanner input = new Scanner(System.in);
		int score = 1;
		System.out.println("Let's play Stone-Paper-Scissors!");
		ArrayList<Integer> fc = new ArrayList<>();
		while (score > 0) {
			System.out.println("\nType rock, paper, or scissors:");
			String play = input.nextLine().toLowerCase();

			Random rand = new Random();
			int randomNumber = rand.nextInt(3) + 1;

			String computerPlay = "";
			if (randomNumber == 1)
				computerPlay = "rock";
			else if (randomNumber == 2)
				computerPlay = "paper";
			else
				computerPlay = "scissors";

			System.out.println("Computer chose: " + computerPlay);

			// Game Logic
			if (play.equals(computerPlay)) {
				System.out.println("It's a tie! Score stays the same.");
			} else if ((play.equals("rock") && computerPlay.equals("scissors"))
					|| (play.equals("paper") && computerPlay.equals("rock"))
					|| (play.equals("scissors") && computerPlay.equals("paper"))) {
				System.out.println("You win this round! Score increased.");
				score++;
				fc.add(score);
			} else {
				System.out.println("You lose this round. Score decreased.");
				score--;
				fc.add(score);
			}

			System.out.println("Current score: " + score);
		}

		System.out.println("\nGame Over! Your score reached 0.");
		input.close();
		BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		    System.out.println(line);
		}
		reader.close();

		for (int i = 0; i < fc.size() - 1; i++) {
			if (fc.get(i) > fc.get(i + 1)) {
				// Swapping
				int temp = fc.get(i);
				fc.set(i, fc.get(i + 1));
				fc.set(i + 1, temp);
			}
		}
		
		writer.write(fc.get(fc.size() - 1));

	}
}
