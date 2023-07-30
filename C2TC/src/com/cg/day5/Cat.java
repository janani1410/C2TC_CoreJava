package com.cg.day5;

public class Cat extends Animal{
	void meow(){
		System.out.println("meowing...");
	}

	public static void main(String[] args) {
	Cat c=new Cat();
	c.eat();
	c.meow();

	}

}
