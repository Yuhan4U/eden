package com.yuhan.studies.numbers;

import java.util.Scanner;

public class perimeter {
	
	public void square() {
		Scanner input = new Scanner(System.in);
		System.out.println("length of side");
		int side = input.nextInt();
		int perimeter = side * 4;
		System.out.println("(Perimeter = SIDE x 4)");
		System.out.println("Perimeter of square :" + perimeter +" CM ");
	}

	public void rectangle() {
		Scanner input = new Scanner(System.in);
		System.out.println("length of width");
		int width = input.nextInt();
		System.out.println("length of lenght");
		int length = input.nextInt();
		int perimeter = 2 * (length + width);
		System.out.println("(Perimeter = 2 x (Length + Width))");
		System.out.println("Perimeter of rectangle :" + perimeter +" CM");
	}

	public void circle() {
		Scanner input = new Scanner(System.in);
		System.out.println("length of RADIUS");
		int radius = input.nextInt();
		float pie = (float) 3.14;
		float area=pie*(radius*2);
		System.out.println("(Perimeter = pie *(Radius X 2))");
        System.out.println("Perimeter of circle :"+area +" CM ");
	}
}
