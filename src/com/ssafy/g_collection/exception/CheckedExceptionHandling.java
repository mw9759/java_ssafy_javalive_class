package com.ssafy.g_collection.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionHandling {
	
	public static void main(String[] args) {
		// jdk1.7 : try with resource: 자동으로 자원해제 처리함.--
		try(FileReader in = new FileReader("input.txt");){
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
    @SuppressWarnings("resource")
   // public static void main(String[] args) throws FileNotFoundException {
    public static void main1(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	FileReader in = null;
    	try {
    		// in scope: try 구문 내부에서만 접근 사용
    		Class.forName("abc.def");
    		in = new FileReader("input.txt");
    		// 파일 리소스 위치: 프로젝트 폴더가 현재 폴더 기준.
    		DriverManager.getConnection("some");
    	} catch(ClassNotFoundException e){
    		System.out.println(e.getMessage());
    	} catch(FileNotFoundException e){
    		e.printStackTrace();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}finally {
    		try {
    			if(in != null)
    				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 오류 발생 이유??
    		System.out.println("=======================");
    	}
    	
        // END:
        System.out.println("프로그램 정상 종료");

    }
}
