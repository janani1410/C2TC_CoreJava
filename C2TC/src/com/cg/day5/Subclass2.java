package com.cg.day5;

public class Subclass2 extends Subclass1 {
		void mul() {
			System.out.println("mul");
		}

	public static void main(String[] args) {
		Subclass2 sc = new Subclass2();
		sc.sub();
		sc.add();
		sc.mul();
		
		

	}

}
