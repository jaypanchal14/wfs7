package com.example;

public class Employee {
	
	
	public Employee(String eName, String eAddress, String eDepartment) {
		super();
		this.eName = eName;
		this.eAddress = eAddress;
		this.eDepartment = eDepartment;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eAddress=" + eAddress + ", eDepartment=" + eDepartment + "]";
	}


	public Employee(String eName,int salary) {
		
	}
	public Employee(String eName,String eDepartment) {
		this(eName,null,eDepartment);
	}
	public Employee() {
		this("Vikram","Mumbai");
	}


	private String eName;
	private String eAddress;
	 String eDepartment;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		switch(eDepartment) {
		case "Sales":
			this.eDepartment=eDepartment;
			break;
		case "Admin":
			this.eDepartment=eDepartment;
			break;
		case "Account":
			this.eDepartment=eDepartment;
			break;
		case "Marketing":
			this.eDepartment=eDepartment;
			break;
		default:
			this.eDepartment="Trainee";
		
		}
		
		
	}
	
}
