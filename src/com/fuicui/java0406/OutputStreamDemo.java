package com.fuicui.java0406;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class OutputStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File f=new File("e:/text.txt");//指定要操作的文件
//		OutputStream f1=null;//定义字节输出流对象
//		try {
//			f1=new FileOutputStream(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String str="hello world";//要打印的对象
//		byte[] b=str.getBytes();//将字符串转化为字节数组
//		try {
//			f1.write(b);//输出内容
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			f1.close();//关闭流
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
		File from=new File("e:/1/a.txt");
		File to=new File("e:/text副本.txt");
		OutputStreamDemo o = new OutputStreamDemo();
		o.copy(from, to);
	}
	public void copy(File from,File to) throws IOException{
		byte[]b=new byte[(int)from.length()];
		//定义字节流输入、输出对象
		InputStream in=null;
		OutputStream out=null;
		try {
			in=new FileInputStream(from);
			out=new FileOutputStream(to);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.read(b);//读取内容
		out.write(b);//写入内容
		out.close();//关闭流
		in.close();
	}
}
