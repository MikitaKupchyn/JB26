package com.by.epam.lesson3decomp;

import java.util.Scanner;

public class list35 {

		public static void main(String[] args) {
		
		int n = 10;
		Scanner sc = new Scanner(System.in);
		
		String max = "", min = "", str = "";
		
		for (int i = 0; i < n; i++) {
		System.out.print("> ");
		
		if (sc.hasNextLine()) {
		str = sc.nextLine();
		
		if (i == 0) {
		min = str;
		}
		
		if (str.length() > max.length()) {
		max = str;
		
		} else if (str.length() < min.length()) {
		min = str;
		
		
		}
		}
		}
		
		PrintResults(min, max); 
		
		}
		
		public static void PrintResults(String min, String max) {
		
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
		
		}
		}