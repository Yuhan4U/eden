package com.yuhan.studies.numbers;

import java.util.Scanner;

public class PerimeterMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Permieter");
		System.out.println("1. Square 🟥 ");
		System.out.println("2. Rectangle 💳");
		System.out.println("3. Circle ⚫");
		int first = input.nextInt();
		switch (first) {
		case (1):
			perimeter meter = new perimeter();
            meter.square();
			break;
		case (2):
			perimeter meter1 = new perimeter();
			meter1.rectangle();
			break;
		case(3):
			perimeter meter11 = new perimeter();
		meter11.circle();
		break;
		default:
			System.out.println();

		}

	}
}
