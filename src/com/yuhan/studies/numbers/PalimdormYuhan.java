package com.yuhan.studies.numbers;

import java.util.Scanner;

public class PalimdormYuhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		int orginal = number;
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;

		}
		if (orginal == reverse) {
			System.out.println(orginal + " Is a palindrome number");
		} else
			System.out.println(orginal + " Is  not a palindrome number");
	}
}