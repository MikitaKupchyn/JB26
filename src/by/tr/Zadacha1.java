package by.tr;

import java.util.Scanner;

public class Zadacha1 {
	
	public static void main(String[] args) {
		
		double x = 0, y = 0, z;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter x:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		
		System.out.println("Enter y:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		} 
		
		
		double temp;
		temp = 1 + x*x*y*y;
		
		double temp1;
		temp1 = 2*x / temp;
		
		double temp2;
		temp2 = x - temp1; 
		
		double temp3;
		temp3 = 2 + Math.abs(temp2);
		
		if (temp3 != 0) {
			z = x * Math.log(x) + y / temp;
			} else {
			System.out.println("Denominator equals Zero");
			z = Double.NaN;
			}
		
		double temp4;
		temp4 = 1 + Math.sin(x+y)*Math.sin(x+y);
		
		
		z = temp4 / temp3 + x;
		
		
		System.out.println("z=" +z);
				
	}

}
