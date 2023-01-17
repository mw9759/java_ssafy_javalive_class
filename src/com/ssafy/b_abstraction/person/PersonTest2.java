package com.ssafy.b_abstraction.person;

public class PersonTest2 {

	public static void main(String[] args) {
		System.out.println(Person2.org);
		
		// 객체
		Person2 p = new Person2();
		p.org = "SSAFY2"; // 바람직한 방법은 아님
		System.out.println(Person2.org);
		p.name = "홍길동";
		p.isHungry = true;
		p.eat();
		p.printInfo();
		//System.out.println(p.name+" : "+p.isHungry+" : "+p.age);
		
		Person2 p2 = new Person2();
		
		p2.name = "하이우";
		p2.work();
		p2.printInfo();
		//System.out.println(p2.org); //p2라는 객체에서도 공유되는 것을 볼 수 있음.
		//System.out.println(p2.name+" : "+p2.isHungry+" : "+p2.age);
	}

}
