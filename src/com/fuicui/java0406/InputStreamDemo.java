package com.fuicui.java0406;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.InputStream;


public class InputStreamDemo {

	
	public static void main(String[] args) {
		File f=new File("e:/1/a.txt");
		InputStream in=null;
		try {
			in=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte b[]=new byte[(int)f.length()];
		try {
			in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(b));
	}
	

}
