package com.hsbc.demo;

public class Caller4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new DemoSample();
	}

}
 class SampleImpl implements ISample,IData {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 class DemoSample extends Sample{

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

interface ISample{
	void move();
	void fly();
	void swim();
}
interface IData{
	void walk();
}


abstract class Sample{
	
	abstract void move();
	abstract void fly();
	abstract void swim();
	
}