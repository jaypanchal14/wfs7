package com.hsbc.demo;

public class Caller1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();
		obj.breath();
		//obj.i=899;
		Animal a=new Animal(5,4);
		obj.swim(a);
		System.out.println(a);
			
	}

}

class Animal{
	public Animal(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public Animal() {
		super();
	}
	private int height;
	private int weight;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + "]";
	}
	
}

  abstract class  A{
	
	  final int i=9;
	public  abstract void breath();
	public void swim(final Animal animal) {
		animal.setHeight(9);
		System.out.println(animal);
		System.out.println("Swim of Class A");
	}
	
	
}

 class B extends A{
	public void fly() {
		System.out.println("Fly of Class B");

	}
	public void breath() {
		
		System.out.println("Breath of Class B");
	}
	
}

class C extends B{
	public void walk() {
		System.out.println("Walk of Class C");

	}

	
}