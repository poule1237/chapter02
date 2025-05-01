package com.javaex.ex15;


public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods를 관리할 배열3칸을 메모리에 올린다
		Goods[] goodsArr  = new Goods[4];
		//상품을 메모리에 올린다
		Goods cup = new Goods("머그컵",2000);
		Goods camera= new Goods("니콘",400000);
		Goods computer = new Goods("LG그램",900000);
		Goods harjoo = new Goods("젤리",500);
		
		//배열에 상품의 주소를 입력한다
		goodsArr[0] = cup;
		goodsArr[1] = camera;
		goodsArr[2] = computer;
		goodsArr[3] = harjoo;
		
		//모든상품에 이름을 출력한다
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		}
		//모든상품의 정보를 출력한다
		for(int i=0; i<goodsArr.length; i++) {
			goodsArr[i].showInfo();
		}
		
		
	}

}
