package com.hsbc.example;

public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder b=new StringBuilder("hello");
		b.append(" world");
		b.append("!");
		b.append(" are").append(" you?");
		b.insert(12, " How");
		System.out.println(b);
		System.out.println(b.length());
		String str=b.toString();
		
	}

}
