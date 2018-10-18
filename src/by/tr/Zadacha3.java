package by.tr;


import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		
		double x = 0, y = 0, h = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		System.out.print("Enter y:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}
		System.out.print("Enter step h:");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
		
		countFunction(x, y, h);
		
	}
	
	public static double countFunction(double x, double y, double h) {
		double z;
		double Fx = 0;
		for (z = x; z <= y; z = z + h) {
			Fx = Math.tan(z);
			System.out.println("| " + x + " |" + "| " + Fx + " |");
		}
		return Fx;

	}
}
