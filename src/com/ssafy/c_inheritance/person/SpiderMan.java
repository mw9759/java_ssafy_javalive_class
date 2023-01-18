package com.ssafy.c_inheritance.person;

public class SpiderMan extends Person{
	boolean isSpider;
	Spider spider;//has a
	
	public SpiderMan() {};
	public SpiderMan(String name) {
		//super()가 생략됨.
		//this.name = name;
		super(name);
		this.isSpider = isSpider;
		this.spider = new Spider();
	}
	void fireWeb() {
//		System.out.println("어떻게 쏘지?ㅠㅠ");
		if(this.isSpider) {
			this.spider.fireWeb();
		} else {
			//System.out.println("사람일 때는 못쏴요ㅠ");
			super.jump();
		}
	}
	//이게 오버라이딩
	@Override
	void jump() {
		if(this.isSpider) {
			this.spider.jump();
		} else {
			System.out.println("폴짝");
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(isSpider);
		builder.append(", ");
		builder.append(spider);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
}
