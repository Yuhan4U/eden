package com.games;

import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread {
	public void run() {
		try {
			Thread.sleep(5000); // wait 5 seconds
		} catch (InterruptedException e) {
			// Timer was interrupted (user typed early)
			return;
		}

		// Timer expiredb
		
		
		if (!ThreadTrial.answered) {
			ThreadTrial.tooLate = true;
			System.out.println("⏰ Timer is done!");
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		try {
			switch (ThreadTrial.number) {
			case (1):
				ThreadTrial.ch = "a";
				break;
			case (2):
				ThreadTrial.ch = "b";
				break;
			case (3):
				ThreadTrial.ch = "c";
				break;
			case (4):
				ThreadTrial.ch = "d";
				break;
			case (5):
				ThreadTrial.ch = "e";
				break;
			case (6):
				ThreadTrial.ch = "f";
				break;
			case (7):
				ThreadTrial.ch = "g";
				break;
			case (8):
				ThreadTrial.ch = "h";
				break;
			case (9):
				ThreadTrial.ch = "i";
				break;
			case (10):
				ThreadTrial.ch = "j";
				break;
			case (11):
				ThreadTrial.ch = "k";
				break;
			case (12):
				ThreadTrial.ch = "l";
				break;
			case (13):
				ThreadTrial.ch = "m";
				break;
			case (14):
				ThreadTrial.ch = "n";
				break;
			case (15):
				ThreadTrial.ch = "o";
				break;
			case (16):
				ThreadTrial.ch = "p";
				break;
			case (17):
				ThreadTrial.ch = "q";
				break;
			case (18):
				ThreadTrial.ch = "r";
				break;
			case (19):
				ThreadTrial.ch = "s";
				break;
			case (20):
				ThreadTrial.ch = "t";
				break;
			case (21):
				ThreadTrial.ch = "u";
				break;
			case (22):
				ThreadTrial.ch = "v";
				break;
			case (23):
				ThreadTrial.ch = "w";
				break;
			case (24):
				ThreadTrial.ch = "x";
				break;
			case (25):
				ThreadTrial.ch = "y";
				break;
			case (26):
				ThreadTrial.ch = "z";
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner input = ThreadTrial.input;
		System.out.println("⌨️ Type " + ThreadTrial.ch + " within 5 seconds: ");
		String userInput = input.nextLine();

		if (ThreadTrial.tooLate) {
			System.out.println("❌ Too late!");
			ThreadTrial.score--;
		} else if (userInput.equals(ThreadTrial.ch)) {
			ThreadTrial.answered = true;

			System.out.println("✅ Just on time!");
			ThreadTrial.timerThread.interrupt(); // stop timer early
			ThreadTrial.score++;
		} else {
			System.out.println("❌ Wrong input");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("SCORE:" + ThreadTrial.score);
	}
}

public class ThreadTrial {
	public static int score = 1;
	public static String ch = "1";
	public static Random rand = new Random();
	static int number = rand.nextInt(26) + 1; // 1 to 26
	public static volatile boolean answered = false;
	public static volatile boolean tooLate = false;
	public static Scanner input = new Scanner(System.in);
	public static MyThread timerThread;

	public static void main(String[] args) {

		timerThread = new MyThread();
		MyThread1 inputThread = new MyThread1();
		MyThread2 scoreprint = new MyThread2();
		timerThread.start();
		inputThread.start();
		scoreprint.start();

	}

}
