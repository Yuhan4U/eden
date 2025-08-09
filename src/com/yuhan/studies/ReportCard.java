package com.yuhan.studies;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Name of Student ");
		String name = input.nextLine();
		System.out.println("How many Subjects ");
		int s = input.nextInt();
		int[] marks = new int[s];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("  mark for " + (i + 1) + " Subject");
			marks[i] = input.nextInt();

		}
		for (int i = 0; i < marks.length; i++) {
			// Safe: i goes from 0 to marks.length - 1
			System.out.println("Mark " + (i + 1) + ": " + marks[i]);
		}
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		System.out.println("Total marks = " + total);
		if (total <= 70) {
			System.out.println(" GRADE: F");

		} else if (total > 70 && total < 75) {
			System.out.println(" GRADE: c");

		} else if (total >= 75&&total<80) {
			System.out.println(" GRADE: c+");

		} else if (total >= 80&&total<85) {
			System.out.println(" GRADE: B");

		} else if (total >= 85&&total<90) {
			System.out.println(" GRADE: B+");

		} else if (total >= 90&&total<95) {
			System.out.println(" GRADE: A");

		} else if (total >= 95) {
			System.out.println(" GRADE: A+");

		}

	}
}