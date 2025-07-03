package com.yuhan.studies.numbers;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("say number to see its  Factors");
		int number = input.nextInt();
	
		for (int i = 1; i <=number; i++) {
		if(number%i==0) {
			System.out.print(i+" ,");
		}else {
		}
	}

}
	
	
}