package com.yuhan.studies.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> fc = new ArrayList<>();
		ArrayList<Integer> sc = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Say the first Number To see its Common Fators");
		int first = input.nextInt();
		System.out.println("Say the Second Number To see its Common Fators");
		int second = input.nextInt();
		for (int i = 1; i <= first; i++) {
			if (first % i == 0) {
				fc.add(i);
			}

		}

		for (int i = 0; i < fc.size(); i++) {
			if (i == 0) {

				System.out.println("Factors of " + first);
				System.out.println(fc.get(i));
			} else {

				System.out.println(fc.get(i));
			}
		}
		for (int i = 1; i <= second; i++) {
			if (second % i == 0) {
				sc.add(i);
			}
		}
		for (int i = 0; i < sc.size(); i++) {
			if (i == 0) {

				System.out.println("Factors of " + second);
				System.out.println(sc.get(i));
			} else {

				System.out.println(sc.get(i));
			}
		}
		for (int i = 0; i < fc.size(); i++) {
			if (sc.contains(fc.get(i))) {
				if (i == 0) {
					System.out.println("Commnon Factors :");
					System.out.println(fc.get(i));
				} else {
					System.out.println(fc.get(i));
				}

			}
		}
	}
}