package com.hsbc.demo;

public class Caller2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		o.out.doSomething();
	
	}

}


class Outer{
	public Outer() {
		this.i=100;
	}
	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	static Inner out=new Inner();
	
	private void doOuterThing() {
		System.out.println("Value of i "+i);
		System.out.println("doOuterthing called.. from Outer");
	}
	
	static class Inner{
		public static void doSomething() {
			Outer o=new Outer();
			o.doOuterThing();
			System.out.println("doSomething called from Inner");
		}
	}
	
}


