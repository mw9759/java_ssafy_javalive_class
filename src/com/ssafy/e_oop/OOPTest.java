package com.ssafy.e_oop;
/*
 * ## OOP 테스트
 * 
 * 
 * */
public class OOPTest {
	
	public static void main1(String[] args) {
		//A 부모클래스 객체 선언 및 생성
		//같은타입의 참조변수 = 같은 타입객체
		A a = new A();
		System.out.println(a.no); // 5
		//System.out.println(a.doA()); // 반환타입이 없으므로 출력내용없음: 오류
		a.doA(); // A
	}
	
	//다형성
	public static void main2(String[] args) {
		//A부모타입의 자식객체 B1객체 생성 할당
		//부모타입의 참조변수는 자식객체를 참소할 수 있다.
		A a = new B1();
		System.out.println(a.no);//부모타입이므로 부모의 no 출력
		a.doA(); //부모로 부터 상속받은 자식이 재정의한 메서드 호출
		//a.doA("데헷"); //자식이 추가로 정의한 메서드이기에 부모객체에서 접근불가
	}
	
	//
	public static void main(String[] args) {
		A a1 = new A(); //OK -같은타입
 		A a2 = new B1();//OK -부모타입(큰타입)
		A a3 = new B3();//OK -부모타입(큰타입)
		
//		B1 b1 = new A(); //오류: 자식타입은 부모객체 참조불가(부모에는 자식멤버가 없음)
//		B1 b2 = new B2(); //오류: 자식타입 끼리는 다른 타입(해당 요소가 존재하지 않음)
		
		//A arr[] = new A(5); // A[] = A(int) / constructor(생성자)
		A[] arr = new A[5];
	}
}

interface IManager{
	int MAX_SIZE = 30;// 모든 멤버변수는 자동으로 상수처리 : public static final 생략
	void search(String a); //자동으로 추상 메서드처리 : public abstract 생략
	void remove(String a); 
}

//IManager 인터페이스 구현 자식 클래스 : ManagerImpl
class ManagerImpl implements IManager {
	
	@Override
	public void search(String a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(String a) {
		// TODO Auto-generated method stub
		
	}
}


abstract class Manager { //추상 메서드가 존재하면 반드시 추상클래스이다(anstract class)
	public abstract void add(B1 b); //추상메서드 
	public void print(Object obj) { //구현메서드
		System.out.println(obj);
	}
}

class A{
	int no =5;
	public void doA() {
		System.out.println("A");
	}
	
}

class B1 extends A{ // 상속
	int no = 10;
	
	@Override
	public void doA() {
		System.out.println(no); //자식의 멤버변수 no = 10, 잘못된 설계이닷.
		System.out.println(super.no); //부모의 멤버변수 no = 5
		System.out.println("A-1: 자식 재정의");
	}
	
	public void doA(String msg) {
		System.out.println("A-1: 자식 중복정의");
	}
}

class B2 extends A{
}

class B3 extends A{
}

