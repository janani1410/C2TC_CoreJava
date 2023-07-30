package com.cg.day2;

public class Condition {

	public static void main(String[] args) {
		System.out.println("-------------while------");
		int i=1;
		while(i<=5) {                  //entry controlled
			System.out.println(i);
			i++;
		}
		System.out.println("------------do while---------");
		do               //exit-controlled//
		{
			System.out.println(i);
			i++;
		}while(i<8);
		
	}

}
