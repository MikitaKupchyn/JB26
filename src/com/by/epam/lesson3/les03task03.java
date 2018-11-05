package com.by.epam.lesson3;

import java.util.Scanner;

public class les03task03 {

	public static void main(String[] args) {
	
		double fx = 0;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x> ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		if (x <= -3) {
			fx = 9;
		} else if (x > 3) {
			fx = 1 / ((Math.pow(x, 2))+1);
		} else {
			System.out.println("Error! Try again");
			return;
			
		}
		
			printResult(fx);
		}
		
		public static void printResult(Double x){
			System.out.println("f(x) = "+x);
	}
	
}
