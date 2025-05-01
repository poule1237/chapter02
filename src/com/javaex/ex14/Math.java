package com.javaex.ex14;

public class Math {
	
	//필드
	//private String name;
	//private int price;
	private final static double PI = 3.141592;
	//생성자
	/*
	public Math() {
		//메모리
	}
	*/
	//메소드gs
	
	//메소드일반
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a + b;
	}
	public static double plus(double a, int b) {
		return a + b;
	}
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static  double  circleArea(int radius) {
		double result = PI * radius * radius;
		return result;
	}
}
