package com.cg.day3;

import java.util.Scanner;

public class TakeInputFrpmUser {

	public static void main(String[] args) {
	//	int i=10;
		//System.out.println(i);
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=sc.nextLine();
		System.out.println("hello"+name);
		sc.close();

	}

}
