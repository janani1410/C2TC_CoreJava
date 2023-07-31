package com.cg.day7;

public class Overriding {

	public static void main(String[] args) {
	 SBI s;
	 RBI b;
	 s=new SBI();
	 s.Intrest();
	 
	 b=new RBI();
	 b.Interest();
	 
	// s=new RBI();
	// s.Intrest();
	 
	b=new SBI();
	b.Interest();
	 
	 

	}

}
