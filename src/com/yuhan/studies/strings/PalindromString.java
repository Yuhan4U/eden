package com.yuhan.studies.strings;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Text");

		String name = input.nextLine();
		System.out.println(name);
		char[] array = new char[name.length()];
		array = name.toCharArray();		
		char[] reverse = new char[name.length()];
		int j = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse[j] = array[i];
			j++;
		}
		System.out.println("");
		System.out.println("Reverse");
		for (int i = 0; i < name.length(); i++) {
			System.out.print(reverse[i]);
		}
		int c = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == reverse[i]) {
				c++;

			}

		}
		System.out.println("\n\n\n---------------------------------");
		if (c == name.length()) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("It is not a palindrome");

		}
	}
}
