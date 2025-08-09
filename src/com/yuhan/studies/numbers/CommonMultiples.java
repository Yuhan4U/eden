package com.yuhan.studies.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> fc = new ArrayList<>();
		ArrayList<Integer> sc = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Say the first Number To see its 2 Common Multiples inside 20 ");
		int first = input.nextInt();
		System.out.println("Say the Second Number To see its 2 Common Multiples inside 20");
		int second = input.nextInt();
		for (int i = 0; i <= 20; i++) {
			int result = i * first;
			fc.add(result);
		}
		for (int i = 0; i <= 20; i++) {
			int result = i * second;
			sc.add(result);
		}
		for (int i = 0; i < fc.size(); i++) {
			if (i == 0) {
				System.out.println(" MULTPLES OF " + first);
				System.out.println(fc.get(i));
			} else {
				System.out.println(fc.get(i));
			}
		}
		for (int i = 0; i < sc.size(); i++) {
			if (i == 0) {
				System.out.println(" MULTPLES OF " + second);
				System.out.println(sc.get(i));
			} else {
				System.out.println(sc.get(i));
			}
		}
		int count = 0;
		for (int i = 1; i < fc.size(); i++) {
			if (sc.contains(fc.get(i))) {
				if (i == 1) {
					System.out.println("COMMON MULTIPLES:");
					System.out.println(fc.get(i));
					count++;

				} else {

					System.out.println(fc.get(i));
					count++;
				}
				if (count == 2)
					break; // stop after finding 2
			}
		}
	}
}