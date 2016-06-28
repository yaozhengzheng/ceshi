package com.kodingke.java0406;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个file对象，指向一个文件或目录（文件或目录不一定存在）
		File file = new File("e:" + File.separator + "a.text");
		System.out.println("判断文件是否存在:" + file.exists());

		// 创建文件
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("文件的绝对路径："+file.getAbsolutePath());
		long lastModified = file.lastModified();
		DateFormat df=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String lastTime = df.format(new Date(lastModified));
		System.out.println("文件的最后修改时间为"+lastTime);
	}

}
