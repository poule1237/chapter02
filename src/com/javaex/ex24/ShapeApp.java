package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		// Shape[] sArray = new Shape[4];

		Drawable[] dArray = new Drawable[4];

		// 포인트를 메모리에 올리고 Drawable이야 라고 속인다
		Drawable dp = new Point(5, 100);

		/*
		 * dp.draw(); ((Point)dp).getX();
		 */

		// 삼각형을 메모리에 올리고 Drawable이야 라고 속인다
		Drawable dt = new Triangle("빨강", "빨강", 10, 20);

		/*
		 * dt.draw(); ((Triangle)dt).getHeight(); ((Shape)dt).getFillColor();
		 */

		Drawable dr = new Rectangle("초록", "초록", 20, 200);
		Drawable dc = new Circle("파랑", "파랑", 5);

		// 배열에 추가
		dArray[0] = dt; // 삼각형
		dArray[1] = dr; // 사각형
		dArray[2] = dc; // 원
		dArray[3] = dp; // 포인트

		// 한번에 그리기
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

		// dp가 Drawable 출신이냐?
		System.out.println(dp instanceof Drawable);

		// dp가 Point 출신이냐?
		System.out.println(dp instanceof Point);

		// dp가 Shape 출신이냐?
		System.out.println(dp instanceof Shape);

		// dt Shape 출신이냐?
		System.out.println(dt instanceof Shape);

		// 한번에 면적구하기--> Point는 Shape으로 캐스팅 할 수 없다
		for (int i = 0; i < dArray.length; i++) {
			if (dArray[i] instanceof Shape) { // 방의 주소가 Shape출신이냐? -->면적구할수 있음
				((Shape) dArray[i]).area();
			}

		}

	}

}