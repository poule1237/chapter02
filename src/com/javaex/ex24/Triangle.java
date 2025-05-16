package com.javaex.ex24;

public class Triangle extends Shape implements Drawable {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	/*
	 * public Triangle(int width, int height) { this.width = width; this.height =
	 * height; }
	 */

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

	// Drawable 인터페이스 구현
	public void draw() {
		System.out.println("===삼각형을 그렸습니다.================================");
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("가로:" + this.width);
		System.out.println("세로:" + this.height);
		System.out.println("===================================================");
	}

	// Shape의 area()메소드 오버라이드: 넓이구하는 함수
	public void area() {
		System.out.println("삼각형의 넓이--------------------");
		System.out.println(width * height / 2);
		System.out.println("------------------------------");
	}

}