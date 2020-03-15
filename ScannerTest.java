package com.aydin.format;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Uzun gir:");
		Long l=scanner.nextLong();
		System.out.println("Sicim gir: ");
		String s=scanner.next();
		System.out.println("İkişer gir");
		double d=scanner.nextDouble();
		
		
		System.out.printf("%10d %-20s %9.2f \r\n",l,s,d);
		
	}
	
	/*
	 * 
	 * */
	 */
}
