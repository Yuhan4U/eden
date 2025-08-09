package com.yuhan.studies.numbers;

import java.util.Scanner;

public class Pattern {

	private static final int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("say number to see  a pattern");
		int number = input.nextInt();
		char r = '*';
		int c = 1;
		for (int i = 1; i <= number; i++) {
			for (int g = 1; g <= i; g++) {
				System.out.print(r);
				System.out.print(r);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
