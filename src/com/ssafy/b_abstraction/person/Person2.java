package com.ssafy.b_abstraction.person;

public class Person2 {
	static String org = "SSAFY";
	//속성
	String name;
	int age;
	boolean isHungry;
	
	//동작
	void work() {
		isHungry = true;
	}
	void eat() {
		isHungry = false;
	}
	void printInfo() {
		System.out.println(name+isHungry+age);
	}
}
