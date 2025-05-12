package com.javaex.ex26;

import java.io.IOException;
import java.util.Scanner;

//정우성
public class MyFileApp {
	
	public static void main(String[] args) throws IOException {
		/*
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		MyFile sf = new MyFile();
		String str = sf.read("C:\\javastudy\\java\\주소록.txt");
		System.out.println(str);
		*/
		
		MyFile sf = new MyFile();
		sf.read("C:\\javastudy\\java\\주소록.txt");
		
	 
	}

}
