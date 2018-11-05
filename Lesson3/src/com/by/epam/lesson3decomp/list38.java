package com.by.epam.lesson3decomp;

import java.util.Scanner;

public class list38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int digit = 0;
		System.out.print("Enter a number: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
		calcdigit (number);
	}
	
	private static void calcdigit(int number) {
		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			
		}
		printDigit(digit);
	}
		

	private static void printDigit(int digit) {
		if (digit % 2 == 0) {
		System.out.println("Even digit in the number.");
		return;
		}
		
		System.out.println("Uneven digit in the number.");
		}
}
