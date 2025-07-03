package com.games;

import java.io.IOException;
import java.util.*;

public class NumberGuesingGame {

    public static void main(String[] args) {
        NumberGuesingGame game = new NumberGuesingGame();
        Scanner input = new Scanner(System.in);

        while (true) {
            int choice = game.showMenu(input);
            if (choice == 1) {
                game.playGame(input);
                if (!game.askToContinue(input)) {
                    System.out.println("Thanks for playing!");
                    break;
                }
            } else if (choice == 2) {
                try {
                    ScoreFileReader.displayLeaderBoard();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }

    public int showMenu(Scanner input) {
        System.out.println("\n--- MENU ---");
        System.out.println("1. PLAY GAME");
        System.out.println("2. LEADER BOARD");
        System.out.print("Select your option: ");
        return input.nextInt();
    }

    public boolean askToContinue(Scanner input) {
        System.out.println("Do you want to play again? (1 = Yes, 2 = No): ");
        int choice = input.nextInt();
        return choice == 1;
    }

    public void playGame(Scanner input) {
        final int CLOSE_FACTOR = 10;
        input.nextLine();  // Consume leftover newline
        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int score = 100;

        System.out.println("Guess the number (between 1 and 100):");
        int guess = input.nextInt();

        while (guess != randomNumber) {
            int diff = Math.abs(randomNumber - guess);

            if (guess > randomNumber) {
                System.out.println(diff <= CLOSE_FACTOR ? "High! But close. Try again:" : "Too high! Try again:");
            } else {
                System.out.println(diff <= CLOSE_FACTOR ? "Low! But close. Try again:" : "Too low! Try again:");
            }

            score -= 10;
            if (score == 0) {
                System.out.println("You lost! Score is 0.");
                return;
            }

            guess = input.nextInt();
        }

        System.out.println("Congrats! You guessed it right.");
        System.out.println("Your final score is: " + score);

        Map<String, Integer> playerScore = new HashMap<>();
        playerScore.put(playerName, score);

        try {
            ScoreFileWriter.saveScoresToFile(playerScore);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== High Score Leader ===");
        try {
            ScoreFileReader.displayLeaderBoard();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
