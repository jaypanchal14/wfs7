package com.hsbc.demo;


public class Caller3 {

	public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.doOuter();
	}

}


class Outer1{
	public Outer1() {
		this.i=100;
	}
	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	private Inner out=new Inner();
	
	public void doOuter() {
		out.doSomething();
	}
	private void doOuterThing() {
		System.out.println("Value of i "+i);
		System.out.println("doOuterthing called.. from Outer");
	}
	
	private class Inner{
		  void doSomething() {
			doOuterThing();
			System.out.println("doSomething called from Inner");
		}
	}
	
}


