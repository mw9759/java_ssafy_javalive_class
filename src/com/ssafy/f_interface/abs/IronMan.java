package com.ssafy.f_interface.abs;

public class IronMan implements Heroable{

	@Override
	public void changeChape(boolean inHeroMode) {
		System.out.println("모양 변경");
	}

	@Override
	public int fire() {
		System.out.println("발사");
		return 0;
	}

	@Override
	public void upgrade() {
		System.out.println("버전up");
	}
}
