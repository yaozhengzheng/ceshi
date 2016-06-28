package com.lianxi.java0407;

import java.util.Scanner;

public class FileAddDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean f = true;
		int n = 0;
		int sum =0;
		while (f) {
			System.out.println("请输入内容");
			int str = s.nextInt();
			System.out.println("输入的内容是" + str);
			n++;
			sum = sum + str;
			if(n==2){
				System.out.println("两个数的和是" + sum);
				break;
			}

		}

	}

}
