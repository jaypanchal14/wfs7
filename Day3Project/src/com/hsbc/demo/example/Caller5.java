package com.hsbc.demo.example;

public class Caller5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new MyComponent();
		int data=A.moveData();
		
		A1 obj1=new NewComponent();
		C obj2=new C() {

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				
			}
			
		};
	
	}

}

class NewComponent extends A1{

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void swim() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class A1 extends B1{
	abstract void move();
}

abstract class B1 extends C1{
	abstract void fly();
}

abstract class C1{
	abstract void swim();
}

class MyComponent implements A,B,C{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}

interface A{
	int MY_VARIABLE=90;
	void fly();
	void move();
	void swim();
	void walk();
	default void run() {
		
	};
	default void pool() {
		
	};
	static int moveData() {
		return 0;
	}

}

interface B{
	void swim();
	void fly();
}

interface C{
	void walk();
}