package Lesson2;

import java.util.Scanner;

public class Les2task3 {

	public static void main(String[] args) {
		double r = 0, s, l;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r: ");
		if (sc.hasNextDouble()) {
			r = sc.nextDouble();
			}
		
		l = 2*Math.PI*r;
		
		s = Math.PI*Math.pow(r, 2);
		
		System.out.println("L=" + l);
		System.out.println("S=" + s);

	}

}
