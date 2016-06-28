package com.lianxi.java0407;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCopyDemo {

	/**
	 * 复制文件和图片
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File from=new File("d:/a.txt");
		File from = new File("d:/a.jpg");
		// File to=new File("e:/a1.txt");
		File to = new File("e:/a1.jpg");
		FileCopyDemo fcd = new FileCopyDemo();
		fcd.copy(from, to);
	}

	public void copy(File from, File to) throws IOException {
		byte b[] = new byte[(int) from.length()];
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(from);
			out = new FileOutputStream(to);
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
