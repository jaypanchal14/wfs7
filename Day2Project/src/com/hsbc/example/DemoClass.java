package com.hsbc.example;


public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Employee e=new Employee();
		e.setName("aaa");
		System.out.println(e.getName());
		e.setAge(90);
		System.out.println(e.getAge());
		
		Manager m1=new Manager();
		m1.setName("Raj Kumar");
		Manager m2=new Manager();
		
		
	}

}

 class Manager{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

 class Employee{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<21 || age>56)
			this.age=22;
		else
			this.age = age;
	}
	private String name;
	private int salary;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("") || name.equals("aaa"))
			this.name="Default Name";
		else
			this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}