package com.ssafy.b_abstraction.constructor;

public class DefaultPerson {
	
  //멤버 변수
//  String name; //멤버변수 선언만 해서 기본값으로 자동 초기화댐 == null
  String name = "손님"; // 명시적 초기화
  int age;
  boolean isHungry;

  public DefaultPerson() {
	  System.out.println("해당 클래스 객체 생성시 필요한 공통로직 수행: 별출력합니다.");
	  System.out.println("기본생성자 호출 수행됨");
  } //-- 생략된 기본 생성자
  // 이름을 아규먼트로 받는 생성자 선언
  // 개발자가 명시적으로 생성자 정의 하면 기본생성자는 자동으로 제공하지 않음
  // 기본생성자를 이용한 객체 생성 불가
  // 기본생성자를 이요한 객체 생성을 허용하려면
  // 명시적 생성자 정의시에 기본생성자도 함께 명시적으로 중복정의할것.
  public DefaultPerson(String name) {
	  this();
	  System.out.println("String 아규먼트 받는 생성자 호출 수행댐: "+ name);
	  //name = name; //매개변수 = 매개변수; => 맴버변수명과 매개변수명 동일하면 맴버변수를 식별할 수 있는 방법필요
	 
	  
	  //생성자에 전달받은 매개변수의 값으로 멤버변수 값을 초기화.
	  //멤버변수명 = 매개변수명;
	  this.name = name;	
  }
  
  //모든 멤버변수 데이터를 매개변수로 전달받아서 초기화시키는 생성자 중복정의
  public DefaultPerson(String name, int age, boolean isHungry) {
	  this(name, age);//this() 는 생성자의 첫번째 수행문에
	  System.out.println("모든 멤버변수 데이터를 매개변수로 전달받아서 초기화시키는 생성자 중복정의");
//	  this.name = name;
//	  this.age = age;
	  this.isHungry = isHungry;
  }
  
  public DefaultPerson(String name, int age) {
	  this(name);
	  System.out.println("name, age 초기화 생성자 수행");
	  //this.name = name;
	  this.age = age;
	}
//java.lang.object 부모 클래스의 toSring() 메서드 재정의: 다형성
  //생성자 돌렸을때 출력문.
  @Override
  public String toString() {
	  return "DefaultPerson [name=" + name + ", age=" + age + ", isHungry=" + isHungry + "]";
  }
  
  public static void main(String[] args) {
	  DefaultPerson p1 = new DefaultPerson();
	  System.out.println();
	  DefaultPerson p2 = new DefaultPerson("손민우");
	  System.out.println();
	  DefaultPerson p3 = new DefaultPerson("손민우", 27, true);
	  System.out.println();
	  DefaultPerson p4 = new DefaultPerson("손민우", 27);
	  
  }
  
  
  
  public static void main1(String[] args) {
	System.out.println("---기본생성자 이용 객체 생성---");
    DefaultPerson person = new DefaultPerson();
//    person.name = "홍길동";
//    person.age = 10;
//    person.isHungry = false;
    System.out.println(person);
    
    System.out.println("---string 아규먼트 받는 생성자 호출 수행됨:---");
    DefaultPerson person2 = new DefaultPerson("손민우");
    System.out.println(person2);
  }
}
