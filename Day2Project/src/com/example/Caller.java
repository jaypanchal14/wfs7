package com.example;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m=new Manager("Tarun", "Mumbai", "Sales");
		m.setReportee(new Employee[] {
				new Employee("Mohit", "Delhi", "Sales"),
				new Employee("Nupur", "Pune", "Sales"),
				new Employee("Vishal", "GandhiNagar", "Sales"),
				new Employee("Arun", "Hyderabad", "Sales")
				
		});
		
		System.out.println(m.geteName()+", "+m.geteAddress()+", "+m.geteDepartment());
		System.out.println(m);
	}

}
