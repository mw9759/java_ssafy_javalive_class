package com.ssafy.c_inheritance.person;

public class SpiderManTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커");
		sman.isSpider = false;
		sman.name = "피터파커";
		sman.ead();
		sman.jump();
		sman.isSpider = true;
		sman.fireWeb();
		
		sman.ead("젓가락");
		sman.jump();
		
		System.out.println(sman);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
