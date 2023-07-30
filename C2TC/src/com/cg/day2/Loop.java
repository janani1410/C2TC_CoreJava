package com.cg.day2;

public class Loop {

	public static void main(String[] args) {
		System.out.println("------------for loop---------");
		int sum=0;
		for(int i=0;i<5;i++) {
			 sum+=i;
			System.out.println(sum);
		}
		System.out.println("----------------nestedloop--------");
           
           for(int i=1;i<=6;i++) {
        	   for(int j=6;j>=i;j--) {
        		   System.out.println(j);
        	   }
        	   System.out.println();
        	   
           }
          System.out.println("----------for each ----------");
          int a[]= {10,20,30,40};
          for(int i:a) {
        	  System.out.println(i);
          }
	}

}