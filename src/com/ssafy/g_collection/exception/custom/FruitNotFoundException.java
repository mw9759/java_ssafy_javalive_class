package com.ssafy.g_collection.exception.custom;
/** 사용자 정의 예외 클래싀
 *  해당 과일이 존재하지 않는 경우에 예외발생.
 *  
 *  사용자 예외클래스 정의 규칙
 *  1. extends Exception
 *  2. super("예외 메세지")
 *  
 * */
public class FruitNotFoundException extends Exception{
	public FruitNotFoundException() {
		super("해당 과일이 존재하지 않습니다.");
	}
	
	public FruitNotFoundException(String name) {
		System.out.println("zzz");
	}
}
