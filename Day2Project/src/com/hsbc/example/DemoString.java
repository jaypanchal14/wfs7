package com.hsbc.example;

public class DemoString {

	
	public static void main(String sp[]) {
		String s=new String("abc");
		String s1="abc";
		String s4="abc";
		String s2=new String("abc");
		String s3=s2;
		if(s1.equals(s))
			System.out.println("String are equal");
		else
			System.out.println("String are not equal");
		
		Person p=new Person();
		p.name="Vikram";
		//Person p1=new Person(); 
		Person p1=p;
		p1.name="Vishal";
		System.out.println("Name of p is "+p.name);
		System.out.println("Name of p1 is "+p1.name);
			
		String str1=new String("abc");
		String str2=str1;
		str1="xyz";
		str2="xyz";
		str2="pool";
		if(str1==str2)
			System.out.println("Strings str1 and str2 is equal");
		
		System.out.println("String str1 : "+str1);
		System.out.println("String str2 : "+str2);
		}
}

class Person{
	String name="";	
}
