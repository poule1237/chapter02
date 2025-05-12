package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Triangle t01 = new Triangle("빨강","검정",10,5);
		Shape s01 = new Shape("주황","검정");
		//System.out.println(t01.toString());
		/*
		t01.draw();
		t01.getWidth();
		t01.getHeight();
		*/
		
		Rectangle r01 = new Rectangle("검정" , "주황" , 10 ,5);
		//r01.draw();
		
		Circle c01 = new Circle("빨강","검정",9);
		//c01.draw();
		
		Triangle st = new Triangle("초록","초록",100,100);
		st.getFillColor();
		//st.draw();
		//st.getHeight();
		//st.getWidth();
		
		Circle sc = new Circle("빨강","빨강",50);
		sc.getFillColor();
		//sc.draw();
		
		Shape sr = new Rectangle("노랑","노랑",33,33);
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			
			
		}
	
	}		
}
