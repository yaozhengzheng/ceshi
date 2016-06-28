package com.fuicui.java0406;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("e:/text.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < 1024; i++) {
			sb.append(i).append("\t");
		}	
		bos.write(sb.toString().getBytes());
			bos.flush();
			bos.close();
			FileInputStream fis=new FileInputStream(f1);
			BufferedInputStream bis=new BufferedInputStream(fis);
			byte b[]=new byte[1024];
			bis.read(b);
			System.out.println(new String(b));
			fis.close();

	}

}
