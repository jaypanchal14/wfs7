package com.hsbc.demo;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee m=new Employee("Manish", "Delhi", 28);
		
		if(m instanceof Manager) {
			Manager m1=(Manager)m;
			System.out.println(m1);
		}
		System.out.println(m);
	}

}

class Manager extends Employee{
	private String department;

	public String getDepartment() {
		return department;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String location, int salary) {
		super(location, salary);
		this.department="Sales";
	}

	public Manager(String name, String address, int age) {
		super(name, address, age);
		this.department="Sales";
		this.location="Mumbai";
		this.salary=30000;
		
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Manager(String department) {
		super();
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", location=" + location + ", salary=" + salary + ", name=" + name
				+ ", address=" + address + ", age=" + age + "]";
	}

	
}

class Employee extends Person{
	protected String location;
	protected int salary;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String location, int salary) {
		super();
		this.location = location;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String address, int age) {
		super(name, address, age);
		this.location="Mumbai";
		this.salary=30000;
	}
	@Override
	public String toString() {
		return "Employee [location=" + location + ", salary=" + salary + ", name=" + name + ", address=" + address
				+ ", age=" + age + "]";
	}
	
	
}
class Person{
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	public Person() {
		super();
	}
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	protected String name;
	protected String address;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}