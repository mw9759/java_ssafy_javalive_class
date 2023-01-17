package com.ssafy.b_abstraction.method;

public class OverloadingMethod {
	//메서드 2개의 숫자(정수)를 아구먼트로 전달받아서 결과를 반환하는 메서드
	//더하는 기능: 메서드이름
	//아규먼트: 2개, int(정수형)
	//반환타입: 정수형
	//반환값이 없으면 void
	//반환값이 있으면 반드시 마지막 수행문 return 반환값;
	//연산 기본은 int, 같은 타입은 같은타입, 다른 타입은 큰타입 반환
	//정수형 타입: byte, short/char, int, long,
	//접근권한: public(필요시 어디에서나 접근가능한 권한)
	//메서드 선언형식(기본)
	//[접근 제어자][사용제어자] 반환타입 메서드이름(매개변수타입 매개변수명,....) {
	// 수행문;
	//}
	
	//클래스 메서드(static method) : 객체 생성없이 사용가능.
	public static int add(int no1, int no2) { // 매개변수(지역변수)
		System.out.println("A");
		//지역변수
		int result = no1 + no2;
		return result;
	}
	
	//인스턴스 메서드: 객체를 생성후에 참조변수명으로 접근 사용 가능한 메소드
	//두개의 실수float를 아규먼트로 전달받아 결과 반환하는 메서드: 중복정의, 메서드 이름 add()
	public float add(float no1, float no2) {
		System.out.println("B");
		float result = no1 + no2;
		return result;
	}
	
	//두개의 숫자(int, double) 아규먼트로 전달받아 결과 반환하는 메서드: 중복정의
	public double add(int no1, double no2) {
		System.out.println("C");
		double result = no1 + no2;
		return result;
	}
	
	//멤버변수(인스턴스변수) 선언시에 동일한 타입 선언시에는 한줄에 여러개 선언 가능함
	//for 구문에서 초기값으로 동일한 타입 다중 선언해야하는 경우 가능함.
	int no1, no2;
	
	//클래스 메서드: 프로그램 시작시에 자동 로딩, 객체 생성없이 사용가능
	//스태틱 메서드: static 멤버는 객체생성없이사용. 직접객체 생성해서 사용.
	public static void main(String[] args) {
		//class(static) 메서드는 객체 생성하지 않고 static main() 메서드에서 사용가능
		int result = add(10,20);
		
		//instance 메서드는 객체 생성후에 참조변수 접근 사용
		
	}
	
	
	
	
	
	
	
}
