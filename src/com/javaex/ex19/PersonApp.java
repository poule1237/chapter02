package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {
		/*
		//학생의 개념 --> 이름 나이  학교이름
		//Student 의 extends Person지우고 테스트
		//Student 가 Person을 상속받기전
		Student s01 = new Student();
		s01.setSchoolName("제주고등학교");
		//이름 X
		//나이 X
		*/
		
		//Student 가 Person을 상속받은 후
		Student s02 = new Student();
		s02.setSchoolName("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);
		
		/*
		person(2)
		Student()
		*/
		System.out.println("-----------------");
		//이렇게 쓰는게 젤 자연스럽다
		Student s03 = new Student("이효리", 22, "제주고등학교");
		//생성자 완료순서: Person(2) --> Student(3)
		
		System.out.println(s03.getSchoolName());
		System.out.println(s03.getName());
		System.out.println(s03.getAge());
		
		s03.showInfo();
		
	}

}