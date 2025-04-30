package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		
		

	}

}
