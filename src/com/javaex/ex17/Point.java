package com.javaex.ex17;

public class Point {

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

	// 메소드gs
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
	public String toString() {//개발용 빠른값확인용
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void drow() {
		//화려한 애니메이션이 있는 점찍기 그림으로 표현된다고 생각
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
}