package com.by.epam.lesson3decomp;

import java.util.Scanner;

public class list37 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, num_day = 0;
		
		
		System.out.print("Enter year: ");
		if (sc.hasNextInt()) {
		year = sc.nextInt();
		}
		System.out.print("Enter month: ");
		if (sc.hasNextInt()) {
		month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		num_day = 31;
		break;
		case 2:
		if (year % 4 == 0) {
		num_day = 29;
		} else {
		num_day = 28;
		}
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		num_day = 30;
		break;
		
		}
		
		NumberResults (num_day);
		}
		}
	
		private static void NumberResults(int num_day) {
			System.out.println("Number of days: " + num_day);
			
		}

}