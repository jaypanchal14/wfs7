package com.hsbc.example;

import java.io.IOException;

public class Caller {

	public static void main(String[] args) {

		//Sample abc=new SampleImpl();
		Sample.fly();
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class SampleImpl extends Sample{

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Sample{
	static void fly() {System.out.println("Fly method of Sample");}
	abstract void move();
	static {
		System.out.println("Sample Class");
	}
}