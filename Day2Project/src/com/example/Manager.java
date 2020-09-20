package com.example;

import java.util.Arrays;

public class Manager extends Employee {

	public Manager() {
		
	}
	@Override
	public String toString() {
		return "Manager [reportee=" + Arrays.toString(reportee) + "]";
	}
	public Manager(String eName, String eAddress, String eDepartment) {
		super(eName, eAddress, eDepartment);
	}

	public Manager(String eName, String eAddress, String eDepartment, Employee[] reportee) {
		super(eName, eAddress, eDepartment);
		this.reportee = reportee;
		
	}

	Employee [] reportee;

	public Employee[] getReportee() {
		return reportee;
	}

	public void setReportee(Employee[] reportee) {
		this.reportee = reportee;
	}
	
}
