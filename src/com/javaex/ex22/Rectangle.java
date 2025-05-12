package com.javaex.ex22;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	
	
	
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	
	
	//메소드 gs
	
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

	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	public void draw() {
		System.out.println("====구형을 그렸습니다=============");	
		System.out.println("면색:" +super.getFillColor());
		System.out.println("선색:" +super.getLineColor());
		System.out.println("가로:" +this.width);
		System.out.println("세로:" +this.height);
		System.out.println("================================");
	}

	
	
	
}
