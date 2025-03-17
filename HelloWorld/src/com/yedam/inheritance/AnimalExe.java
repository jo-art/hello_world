package com.yedam.inheritance;

public class AnimalExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal animal = new Animal(); // 직접 인스턴스를 생성하지 못하는 추상클래스
		Animal animal = new Bird();
		animal.sound();
		animal.eat();
	}

}
