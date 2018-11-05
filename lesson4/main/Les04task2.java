package by.epam.lesson4.main;

import java.util.Scanner;

public class Les04task2 {

	 public static void main(String[] args) {
	  int[] a = new int[5];
	  int sum = 0;
	  int c = 2;

	  Scanner scanner = new Scanner(System.in);

	  System.out.println("Enter 5 numbers");
	  for (int i = 0; i < a.length; i++) {
	   a[i] = scanner.nextInt();
	   if (a[i] % c == 0) {
	    sum += a[i];
	   }

	  }
	  System.out.println("The sum of the numbers divided by " + c + " = " + sum);
	 }

}
