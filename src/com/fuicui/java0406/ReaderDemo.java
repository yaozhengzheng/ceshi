package com.fuicui.java0406;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;


public class ReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("e:/text.txt");
		Reader r=new FileReader(f);
		char []c=new char[10];
		System.out.println(r.read(c));
		System.out.println(Arrays.toString(c));
		System.out.println((char)r.read());
	}

}
