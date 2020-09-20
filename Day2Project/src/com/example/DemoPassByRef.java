package com.example;

public class DemoPassByRef {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		System.out.println(e.geteName()+", "+e.geteDepartment()+", "+e.geteAddress());
		
		// TODO Auto-generated method stub
//		Employee e=new Employee("Prince", "Pune", "Sales");
//		//e.seteDepartment("DummyDept");
//		e.eDepartment="WeiredDepartment";
//		System.out.println(e.geteName()+", "+e.geteAddress()+", "+e.geteDepartment());
//		
//		//DemoPassByRef obj=new DemoPassByRef();
//		doSomething(e);
//		System.out.println("*********** After DoSomethig call ***************");
//		System.out.println(e.geteName()+", "+e.geteAddress()+", "+e.geteDepartment());
//		
	}
	public static  void doSomething(Employee e1) {
		e1.seteName("Vikram");
		e1.seteDepartment("Accounts");
		System.out.println(e1.geteName()+", "+e1.geteAddress()+", "+e1.geteDepartment());

	}

}
