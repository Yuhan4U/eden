package com.games;

import java.util.Random;
import java.util.Scanner;

public class MultiplesGame {
    static volatile int P = 5;
    static volatile boolean answered = false;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("HOW MANY QUESTIONS YOU NEED: ");
        int number = input.nextInt();

        System.out.print("1 to how many number: ");
        int numbers = input.nextInt();

        Random rand = new Random();
        int score = 0;

        for (int i = 1; i <= number; i++) {
            int bomb = rand.nextInt(numbers) + 1;
            int bomb2 = rand.nextInt(numbers) + 1;
            int ans = bomb * bomb2;

            P = 5;                 // ✅ RESET timer
            answered = false;      // ✅ RESET answered flag

            // Timer thread
            Thread timerThread = new Thread(() -> {
                try {
                    while (P > 0 && !answered) {
                        Thread.sleep(1000);
                        P--;
                        System.out.println(P);
                    }

                    if (!answered && P == 0) {
                        System.out.println("no mark");
                    }

                } catch (InterruptedException e) {
                    // timer thread stopped
                }
            });

            timerThread.start();

            System.out.println("\nQuestion " + i + ": What is " + bomb + " * " + bomb2 + "?");
            System.out.print("Your answer: ");
            int userAnswer = input.nextInt();
            answered = true;

            timerThread.interrupt(); // stop timer

            if (P == 0) continue; // no mark, skip checking

            if (userAnswer == ans) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer was: " + ans);
            }

            Thread.sleep(500); // wait before next
        }}}