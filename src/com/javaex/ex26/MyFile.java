package com.javaex.ex26;

import java.io.IOException;

//구글
public class MyFile {

	//하드 디스크에 있는 파일을 읽어주는 클래스 
	
	//필드
	
	
	
	//생성자
	public MyFile() {
		
	}
	
	
	//메소드 gs
	
	
	//메소드 일반
	//파일이없어서 못읽었을때 예외처리까지 진형
	public String read(String path) {
		//path의 파일을 찾는다 C:\javastudy\java\주소록.txt
		//파을의 내용을 읽어서 변수에 담는다
		//정상적이면 리턴
		
		//파일이없는경우
		try {
			//path의 파일을 찾는다 C:\javastudy\java\주소록.txt
			//파을의 내용을 읽어서 변수에 담는다
			//정상적이면 리턴
			
			
			//////////////////////
			//예외발생 (파일이없다)
			throw new IOException(); //파일이 없는 상황을 강제로 만듬
			
		} catch (Exception e) {
			System.out.println("파일이 없습니다");
		}
		return "";
	}
	
	
	//파일이없어서 못읽었을때 예외처리를 하지않음
	public String read2(String path) {
	
	try {
		throw new IOException();//파일이 없는 상황을 강제로 만듬
	} catch (Exception e) {
		System.out.println("no file");
	}	
	return "";
	}

}


