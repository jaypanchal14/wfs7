package com.hsbc.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Caller2 {

	public static void main(String[] args) {
	
		
		
		try {
			MyCompoenent comp=new MyCompoenent();
			comp.doOperation(5, 0);
			int j=System.in.read();
			FileReader fr=new FileReader("Sample.txt");
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();
			if(str!=null)
				System.out.println(str);
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
			fr.close();
			}
//		catch(IOException e) {
//			System.out.println("IO Exception");
//
//		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		catch (Exception e) {
//			System.out.println("Generic Exception handler called..");
//		}
		finally {
			System.out.println("Will always execute");
		}
		//		catch(Exception e) {
//			if(e instanceof IOException)
//				System.out.println("IO Exception");
//			else if (e instanceof ArithmeticException)
//				System.out.println("Arithmetic Exception");
//			else
//				System.out.println("Generic Exception handler called..");
//		}
	}

}



class MyCompoenent{
	
	public float doOperation(int i,int j)  {
//		if(j==0) {
//			throw new ArithmeticException("Denominator cannot be zero");
//		}	
//		return i/j;
		float f=0;
		try {
			 f=i/j;
		}
		catch(ArithmeticException e) {
			throw e; 
		}
		return f;
	}
}


