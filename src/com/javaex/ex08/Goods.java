package com.javaex.ex08;

public class Goods {

	// 필드
	private String name;
	private int price;

	//생성자
	public Goods() {//기본생성자-자동으로 생김
		            //*다른생성자가 있으면 자동으로생기지 않늗다
		//메모리에 올리는일(엄청난걸 해주는다)
	}
	
	public Goods(String name, int price) {
		//메모리에 올리는일(엄청난걸 해주는다)
		this.name = name;
		this.price = price;
	}
	
	
	
	// 메소드
	// name 등록
	public void setName(String n) {
		name = n;
	}

	// name 읽어오기
	public String getName() {
		return name;
	}

	// price 등록
	public void setPrice(int p) {
		price = p;
	}

	// price 읽어오기
	public int getPrice() {
		return price;
	}

	// 정보출력
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("==========================");
	}
}
