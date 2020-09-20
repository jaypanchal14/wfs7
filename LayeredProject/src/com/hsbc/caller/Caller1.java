package com.hsbc.caller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Caller1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("sample.txt",true));
			oo.writeObject("Data1");
			oo.writeObject("Data2");
			oo.writeObject("Data3");
			oo.writeObject("Data4");
			oo.flush();
			oo.close();
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("sample.txt"));
		String str="";
		while((str=(String) oi.readObject())!=null) {
			System.out.println(str);
		}
		oi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}


