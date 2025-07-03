package com.yuhan.studies.numbers;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number =number/10;
        }

        // Check if the original and reversed are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}