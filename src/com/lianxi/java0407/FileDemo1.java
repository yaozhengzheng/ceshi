package com.lianxi.java0407;

import java.io.File;

public class FileDemo1 {

	/**
	 * 将一个文件夹的所有目录展现出来（遍历整个文件夹）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		File file = new File("f:/图片");
		findFile(file);
		System.out.println("运行时间" + (System.currentTimeMillis() - startTime)
				+ "ms");

	}

	private static void findFile(File file) {
		File[] f1 = file.listFiles();
		for (int i = 0; i < f1.length; i++) {
			if (f1[i].isDirectory()) {
				findFile(f1[i]);
			} else {
				System.out.println(f1[i].getName());
			}
		}

	}

}
