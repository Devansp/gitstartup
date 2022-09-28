package com.oops;

import javax.security.auth.login.LoginContext;

public class Statictest {
	protected int c=10;
	protected void deva() {
		 System.out.println("protected is visible:self test from outside package");
	}
	
	static protected void logi() { 		
		 System.out.println("base class:wife");
	}
	
 	protected static void logi(int a) {
		System.out.println("value of a: "+a);
	}
	
 	static int z=10;						//imp: static to non static possible
 	 void testz() {							// non static to static non possible
		System.out.println(z);
	}
 	
 /*	int y=10;												//imp: static to non static possible
 	   static void testy() {								// non static to static non possible
		System.out.println(y); 	//it will show error(Cannot make a static reference to the non-static field "y")
	}  */
 	
 	
 	
 	void gopi() {
		// TODO Auto-generated method stub

	} 
	 
	public static void main(String[] args) {
	//	private  int q=20;   // remove invalid/Illegal modifier for parameter q; #######only final is permitted

		
		//		logi();
//		logi(5);
		Statictest s=new Statictest();
		s.logi();
		s.testz();
		
	}
	
}
