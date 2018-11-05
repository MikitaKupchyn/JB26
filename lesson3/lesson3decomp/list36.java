package com.by.epam.lesson3decomp;

import java.util.Scanner;

public class list36 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int lastdigit;
		int lastdigitsq;
		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
		number = sc.nextInt();
		}
		lastdigit = number % 10;
		switch (lastdigit) {
		case 0:
		lastdigitsq = 0;
		break;
		case 1:
		lastdigitsq = 1;
		break;
		case 2:
		lastdigitsq = 4;
		break;
		case 3:
		lastdigitsq = 9;
		break;
		case 4:
		lastdigitsq = 6;
		break;
		case 5:
		lastdigitsq = 5;
		break;
		case 6:
		lastdigitsq = 6;
		break;
		case 7:
		lastdigitsq = 9;
		break;
		case 8:
		lastdigitsq = 4;
		break;
		case 9:
		lastdigitsq = 1;
		break;
		

		default:
		System.out.println("Error!");
		return;
		}
		
		PrintResults(number, lastdigitsq);
}
		
		public static void PrintResults (int number, int lastdigitsq) {
		
		System.out.println("Sq number " + number + " equals " + lastdigitsq);
		}
}