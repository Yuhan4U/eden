package com.yuhan.studies.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.println("say number to see its multiples");
        int number=input.nextInt();
       
         int c=1; 
        for(int i=2;i<=number;i++) {
        
     if(c%i!=0) {
         System.out.print( " ,"+i);
         c++;
     }  
       
     
     
         
        }

}
}