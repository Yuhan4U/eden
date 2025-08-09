package com.yuhan.studies.numbers;

import java.util.Scanner;

public class AreaMainSquareAndRectangle {

	private static Area area;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Area of square click 1 or Area of rectangle click 2 or Area of Circle click 3 ");
		int first = input.nextInt();	
switch(first) {
case(1):
Area area = new Area();
	area.square();
break;
case(2):
	Area1 area1 = new Area1();
area1.rectangle();


break;
case(3):
	Area1 area11 = new Area1();
	area11.circle();
break;
default:
System.out.println("Try again");

}

}}
