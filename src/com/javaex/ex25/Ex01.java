package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
        int num;
        Scanner sc = new Scanner(System.in);
        int result = 0;
        
        num = sc.nextInt();
        
        try {
        	result = 100/num;
        }catch(ArithmeticException e) {
        	//System.out.println(e.toString());
        	System.out.println("0으로 나눌수없습니다");
        }finally {
        	System.out.println("공통영역");
        }
            
        
        System.out.println(result);  
                
        sc.close();

		/*
	try {
	           // 예외가 발생할 가능성이 있는 실행문 
	 } catch ( //처리할 예외 타입  선언  ) {                     
	           //예외 처리문
	 } finally {
	           //예외 발생 여부와 상관없이 무조건 실행되는 문장  ( 생략가능 )
	 }

*/
	}

}
