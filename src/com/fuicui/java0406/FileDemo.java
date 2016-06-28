package com.fuicui.java0406;
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
//		File f = new File("\\test.txt");// workspace所在盘的根目录下
//		System.out.println(f.createNewFile());
//		System.out.println(f.getAbsolutePath());// 绝对路径
//		File f1 = new File("/test.txt");
//		System.out.println(f1.createNewFile());
//		System.out.println(f1.getAbsolutePath());
//		File f2 = new File("test.txt");// 当前工程下
//		System.out.println(f2.createNewFile());
//		System.out.println(f2.getAbsolutePath());
//		File f3 = new File("src\\test.txt");// src下
//		System.out.println(f3.createNewFile());
//		System.out.println(f3.getAbsolutePath());
//		File f4 = new File("src/defaultpackage/test.java");// 包中
//		System.out.println(f4.createNewFile());
//		System.out.println(f4.getAbsolutePath());// 绝对路径
//		FileDemo f=new FileDemo();
//		System.out.println(f.add(10));
		
		long startTime=System.currentTimeMillis();
		File f=new File("f:/图片");
		findFile(f);
		System.out.println("运行时间"+(System.currentTimeMillis()-startTime)+"ms");
	}
	public static void findFile(File f) {
		File[]f2=f.listFiles();
		for (int i = 0; i < f2.length; i++) {
			if(f2[i].isDirectory()){
				findFile(f2[i]);
			}else{
				System.out.println(f2[i].getName());
			}
		}
	}
	public long add(int i){
		if(i>0){
			return i+add(i-1);
		}else{
			return 0;
		}
		
		
		
	}

}
