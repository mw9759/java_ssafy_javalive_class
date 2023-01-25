package com.ssafy.g_collection.exception.custom;

public class NoSpaceException extends RuntimeException{ // unchecked user exception
//public class NoSpaceException extends Exception{ //  checked user exception
	//1. 
	public NoSpaceException(String name) {
		super(name+ "을 넣을 공간이 없습니다.");
	}

}
