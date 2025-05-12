package com.javaex.ex19;

public class Student extends Person{
	//필드
	private String schoolName;

	//생성자
	public Student() {//메모리
		//super();
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {//메모리
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	//////////////////////////////////
	public Student(String name, int age, String schoolName) {
		
		super(name, age);  //Person의 파라미터2개짜리 생성자 실행
		this.schoolName =schoolName;
		System.out.println("Student(3)");
		
	}
	
	
	//////////////////////////////////

	//메소드gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("이름: " + super.getName()); //부모 private
		System.out.println("나이: " + super.age);       //부모 protected 
		System.out.println("학교: " + this.schoolName); //자신
		System.out.println("====================");
		
	}
	
	
	
}