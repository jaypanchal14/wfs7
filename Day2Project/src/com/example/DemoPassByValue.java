package com.example;

public class DemoPassByValue {

	public static void main(String s[]) {
		int x=90;
		int y=80;
		doSomethingRef(x, y);
		System.out.println("Value of x in main method is " +x);
		System.out.println("Value of y in main method is " +y);
		
		
	}
	
	public static void doSomething(int x,int y) {
		x++;y+=10;
		
		System.out.println("Value of x in method is " +x);
		System.out.println("Value of y in method is " +y);
		Integer.parseInt("8989");
	}
	public static void doSomethingRef(Integer x,Integer y) {
		x++;
		y++;
		System.out.println("Value of x in method 1 is "+x);
		System.out.println("Value of y in method 1 is "+y);
		
	}
}
