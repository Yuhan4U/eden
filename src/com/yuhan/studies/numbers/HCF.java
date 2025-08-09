package com.yuhan.studies.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Say the first Number To see its H.C.F ");
		int first = input.nextInt();
		System.out.println("Say the Second Number To see its H.C.F ");
		int second = input.nextInt();
		int hcf = 1;
		for (int i = 1; i <= Math.min(first, second); i++) {
			if (first % i == 0 && second % i == 0) {
				hcf = i;
			}
		}
		System.out.println("H.C.F: " + hcf);
	}
}