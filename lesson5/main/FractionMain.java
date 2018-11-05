package by.epam.lesson5.main;

import java.util.Scanner;

public class FractionMain {
	
	private static Fraction[] arraysFraction;
	private static int k;

	public static void main(String[] args) {
		enterValueOfArray();
		printArray();
	}

	public static void enterValueOfArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		k = scanner.nextInt();
		arraysFraction = new Fraction[k];
		for (int i = 0; i < arraysFraction.length; i++) {
			System.out.println("Enter values of numerator and denominator");
			arraysFraction[i] = new Fraction(scanner.nextInt(), scanner.nextInt());
		}
	}

	public static void printArray() {
		for (int i = 0; i < arraysFraction.length; i++) {
			System.out.println("Array[" + i + "] = " + arraysFraction[i].getFraction());
		}

	}

}
