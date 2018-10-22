package Lesson2;

import java.util.Scanner;

public class Les2task2 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("Enter b:");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		} 
		
		System.out.println("Enter c:");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		} 
		
		double temp;
		temp = 2*a;
		
		if (temp != 0) {
		z = b + Math.sqrt(Math.pow(b, 2) + 4*a*c)/temp - Math.pow(a, 3) + b;
		}else {
			System.out.println("Denimonator equals ZERO!");
			z = Double.NaN;
		}
		System.out.println("z=" + z);
	}

}
