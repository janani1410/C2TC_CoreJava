package com.cg.day2;

public class Statement {

	public static void main(String[] args) {
		System.out.println("-----------if------------");
		int x=4,y=7;
		if(x<y) {
			System.out.println("x is less than y");
		}
		System.out.println("----------else---------");
		if(x>y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("--------- if else ladder--------");
		if(x<3) {
			System.out.println("good morning");
		}else if(x<2) {
			System.out.println("good day");
		}else {
			System.out.println("good evening");
		}
		System.out.println("-----------switch------");
		switch(x) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		}
		System.out.println("----------break-------");
		for(int i=0;i<5;i++){
			if(i==2)
				break;
			System.out.println(i+" ");
		}
		System.out.println("----------continue--------");
		for(int i=0;i<5;i++){
			if(i==2)
				continue;
			System.out.println(i+" ");
		}

	}

}
