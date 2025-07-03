package com.yuhan.studies.numbers;

import java.util.Scanner;

public class MultiplesOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("say number to see its multiples");
		int number = input.nextInt();
		System.out.println("say number to see how many times to multiply the number");
		int times = input.nextInt();

		for (int i = 1; i <= times; i++) {
			int result = i * number;
			System.out.print(" result: " + result);

		}

	}
}