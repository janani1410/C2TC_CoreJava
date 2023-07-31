package com.cg.day4;


class Private{  
private int data=40;  
private void display(){
	System.out.println("Hello java");
	}  
}  
  
 
public class AcessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p=new Private();  
	
		    
		  // Private.display();//Compile Time Error 

	}

}

