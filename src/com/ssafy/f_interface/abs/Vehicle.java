package com.ssafy.f_interface.abs;

public abstract class Vehicle {
	private int curX, curY;
	
	public void reportPosition() {
		System.out.printf("현재 위치: %d, %d\n", this.curX, this.curY);
	}
	
//	public void addFuel() {
//		System.out.println("연료가 필요해!!!");
//	}
	public abstract void addFuel();
}
