package com.javaex.ex13;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int count;
	
	
	// 생성자
	public Goods() {
		// 메모리
		count=count+1;   //count++      ++count
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count=count+1;	//count++      ++count
	}

	// 메소드gs
	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int p) {
		this.price = p;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}
	// 메소드 일반

	
	
	
	
	
	//정보출력
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("==========================");
	}
}
