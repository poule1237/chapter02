package com.javaex.ex11;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//메모리
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		//메모리
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	
	//메서드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메서드 일반
	public void draw() {
		System.out.println("점 x=" + x + ", y=" + y + " 을 그렸습니다.");
		System.out.println("--------------------------");
	}
}
