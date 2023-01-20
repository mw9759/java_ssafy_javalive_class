package com.ssafy.f_interface.abs;

public class IronManTest {

	public static void main(String[] args) {
		IronMan iman = new IronMan();
		Object obj = iman;
		Transformable t = iman;
		Heroable h = iman;
		Fightable f = iman;
	}

}
