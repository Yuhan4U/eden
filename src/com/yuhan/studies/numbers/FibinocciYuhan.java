package com.yuhan.studies.numbers;

import java.util.Scanner;

public class FibinocciYuhan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("limit:");
		int limit = input.nextInt();

		int o = 0;
		int i = 1;

		for (int c = 0; limit > c; c++) {
			int result = o + i;
			System.out.print(result + " , ");
			o = i;
			i = result;

		}
	}
}