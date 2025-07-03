package com.yuhan.studies.numbers;

import java.util.Scanner;

public class AcsendingOrderNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Limit:");
		int limit = input.nextInt();
		int temp2 = limit; 
		int array[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			System.out.println("say the " + (i + 1) + "number");
			array[i] = input.nextInt();
		}
		 for (int i = 0; i < limit - 1; i++) {
	            for (int j = 0; j < limit - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }}
		for (int i = 0; i < limit; i++) {
			System.out.print(array[i] + ",");

		}
	}

}
