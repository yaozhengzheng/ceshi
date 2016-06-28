package com.fuicui.java0406;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File from=new File("");
		File to=new File("");
		CopyDemo cd=new CopyDemo();
		cd.copy(from,to);

	}
	public void copy(File from, File to) throws IOException{
		byte []b=new byte[(int) from.length()];
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream(from);
			out=new FileOutputStream(to);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.read(b);
		out.write(b);
		in.close();
		out.close();
	}
	
}
