package com.yuhan.studies;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("say number to see the prime numbers between the number and 1");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			int c = 1;

			if (i % c == 0) {

			} else {
				System.out.print(i + " ,");

			}
			c++;
		}
	}
}