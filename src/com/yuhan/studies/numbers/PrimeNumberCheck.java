package com.yuhan.studies.numbers;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		int number = input.nextInt();

		int sum = 0;

		// Include all divisors, including the number itself
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number * 2) {
			System.out.print("It is a perfect number");
		} else {
			System.out.print("It is not a perfect number");
		}

	}
}
