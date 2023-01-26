package com.ssafy.collection.list;

public class DuplicateException extends Exception{
	private String key;
	
	public DuplicateException() {
		super("해당 정보를 찾을 수 없습니다.");
	}
	
	public DuplicateException(String key) {
		super(key + " 해당 정보를 찾을 수 없습니다.");
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
