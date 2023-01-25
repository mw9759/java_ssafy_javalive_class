package com.ssafy.g_collection.exception;

public class SimpleException {
    public static void main(String[] args) {
        int[] intArray = { 10 }; //배열크기1. [0]
        try {
        	//System.out.println(intArray[2]); //에러문 예외발생.
        	//ArrayIndexOutOfBoundsException
        	
        	System.out.println(intArray[0]); //정상수행
        	
        	System.out.println(5/0);
        	
        	String name = null;
        	System.out.println(name.length());
        	//예외 발생: NullPointerException
        	
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("예외 메세지." + e.getMessage());
        	System.out.println("예외 클래스." + e.getCause());
        	System.out.println("예외 클래스명." + e.getClass().getSimpleName());
        	System.out.println("예외 트레킹정보" );
        	e.printStackTrace();
        }
        catch(Exception e) {
        	System.out.println("예외 메세지." + e.getMessage());
        	System.out.println("예외 클래스." + e.getCause());
        	System.out.println("예외 클래스명." + e.getClass().getSimpleName());
        	System.out.println("예외 트레킹정보" );
        	e.printStackTrace();
        }
        finally {
        	System.out.println("반드시 수행되는 로직입니다.");
        }
        System.out.println("프로그램 종료합니다.");
    }
}
