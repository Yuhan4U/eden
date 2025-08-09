package com.yuhan.studies.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Say a Number To see  it's prime factors ");
		int first = input.nextInt();

		ArrayList<Integer> fof = new ArrayList<>();
		ArrayList<Integer> foi = new ArrayList<>();
		// To see first's factor
		for (int i = 1; i <= first; i++) {
			if (first % i == 0) {
				fof.add(i);
			}
			
		}
		for (int i = 1; i < fof.size(); i++) {
		    int factor = fof.get(i);
		    int count = 0;  // Initialize count once per factor
		    
		    for (int j = 1; j <= factor; j++) {
		        if (factor % j == 0) {
		            count++;
		        }
		    }
		    
		    if (count == 2) {  // Only print if exactly two divisors (prime)
		        System.out.println(factor);
		    }
		}

			}



	}
