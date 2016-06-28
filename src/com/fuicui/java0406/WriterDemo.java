package com.fuicui.java0406;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("e:/text.txt");
		Writer w=new FileWriter(f,true);
		String str="五元看电影";
		w.write(str);
		w.close();

	}

}
