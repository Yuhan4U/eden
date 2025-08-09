package com.yuhan.studies.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CoPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Say the first Number To see if  it is Co-prime ");
		int first = input.nextInt();
		System.out.println("Say the Second Number To see if  it is Co-prime  ");
		int second = input.nextInt();
		ArrayList<Integer> fof = new ArrayList<>();
		ArrayList<Integer> fos = new ArrayList<>();
		ArrayList<Integer> cf = new ArrayList<>();
		// To find factors of first number
		for (int i = 1; i <= first; i++) {
			if (first % i == 0) {
				fof.add(i);
			}
		}
		// To find factors of second number
		for (int i = 1; i <= second; i++) {
			if (second % i == 0) {
				fos.add(i);
			}
		}
		for (int i = 0; i < fof.size(); i++) {
			int factor = fof.get(i);
			if (fos.contains(factor)) {
				cf.add(factor);
			}

		}
		if (cf.size() == 1) {
			System.out.println(first + " and " + second + " are Co-prime.");
		} else {
			System.out.println(first + " and " + second + " are NOT Co-prime.");
			for (int i = 0; i < cf.size(); i++) {
			System.out.println(cf.get(i));
			}
		}

		input.close();
	}
}
