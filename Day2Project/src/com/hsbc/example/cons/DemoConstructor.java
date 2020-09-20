package com.hsbc.example.cons;
import com.example.*;
public class DemoConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e=new Employee("Rupali",787889,"Delhi");
		Employee e=new Employee("Raj Kumar", "Delhi");
		System.out.println("Employee Name " + e.getName());
		System.out.println("Employee Salary "+e.getSalary());
		System.out.println("Employee location "+e.getLocation() );

		com.example.Employee e1=new com.example.Employee("Vishal", "Bangalore", "Sales");
		com.example.Employee e2=new com.example.Employee();
	}

}


class Employee{
	
	public Employee() {
		this.name="Prince Kazmi";
		this.salary=90909;
		this.location="Delhi";
	}
	
	public Employee(String name,int salary, String location) {
		this.name=name;
		this.salary=salary;
		this.location=location;
	}
	public Employee(String name,String location) {
		this();
		this.name=name;
		this.location=location;
		//this.salary=90000;
	}
	private String name;
	private int salary;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
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