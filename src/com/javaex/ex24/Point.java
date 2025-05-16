package com.javaex.ex24;

public class Point implements Drawable {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
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

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// Drawable 인터페이스 구현
	public void draw() {
		System.out.println("===점을 찍었습니다.================================");
		System.out.println("x:" + this.x);
		System.out.println("y:" + this.y);
		System.out.println("===================================================");
	}

}