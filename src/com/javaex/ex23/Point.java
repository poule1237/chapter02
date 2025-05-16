package com.javaex.ex23;

public class Point extends Shape {

	// 부모의 fillColor, lineColor 없어야된다. Shape을 상속할 필요없다
	// 같은 배열에 들어가야 되니깐 shape을 상속 받았다

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

	public void draw() {
		System.out.println("===점을 찍었습니다.================================");
		System.out.println("x:" + this.x);
		System.out.println("y:" + this.y);
		System.out.println("===================================================");
	}

	// 넓이 개념이 없다
	public void area() {
		System.out.println("점은 면적을 구할 수없습니다.");
	}

}