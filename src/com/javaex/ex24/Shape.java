package com.javaex.ex24;

public abstract class Shape {

	// 필드
	private String fillColor;
	private String lineColor;

	// 생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	/*
	 * public void draw() { //코드쓸게 없어서 억지로 씀 System.out.println("있으면 안되는데 덮어쓰기용"); }
	 */

	// 인터페이스 가 draw()개념을 가지고 있음
	// public abstract void draw();

	public abstract void area();

}