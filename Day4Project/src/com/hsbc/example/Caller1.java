package com.hsbc.example;

import java.io.IOException;

public class Caller1 {

	public static void main(String[] args) {
		int i=0;
		try {
			i=5/0;
			i=i+10;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block called...");
		}
		try {
			System.out.print("Enter Some Value: ");
			System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Value of i : "+i);
	}

}
