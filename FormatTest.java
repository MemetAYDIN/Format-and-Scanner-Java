package com.aydin.format;

import java.util.Formatter;

public class FormatTest {
	
	public static void main(String[] args) {
		long l=5;
		String s="Godoro";
		double d=3.1415;
		System.out.printf("%10d %-20s %9.2f \r\n",l,s,d);
		
		Formatter formatter=new Formatter(System.out);
		formatter.format("%10d %-20s %9.5f \r\n", l,s,d);
		formatter.close();
		
		
		/*
		 * Formatter formatter=new Formatter(System.out);
		formatter.format("%10d %-20s %9.5f \r\n", i,s,d);
		System.out.println(formatter.toString());
		formatter.close();
		 */
	
		
				
				
		
	}

}
