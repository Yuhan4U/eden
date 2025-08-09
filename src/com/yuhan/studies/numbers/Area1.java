package com.yuhan.studies.numbers;

import java.util.Scanner;

public class Area1 {
	void rectangle() {
		Scanner input = new Scanner(System.in);
		System.out.println("length of width");
		int width = input.nextInt();
		System.out.print("size of length");
		int length = input.nextInt();
		int area = width * length;
		System.out.println("Area of rectangle:" + area);

	}

	void circle() {
		Scanner input = new Scanner(System.in);
		System.out.println("length of radius");
		int radius = input.nextInt();
		float pie = (float) 3.14;
	float area=pie*(radius*radius);
	System.out.println("AREA OF CIRCLE:"+area+"CM");
	}
}