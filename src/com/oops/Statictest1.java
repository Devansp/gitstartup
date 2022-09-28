package com.oops;


public class Statictest1 extends Statictest{

	@Override
	protected
	void deva() {
		// TODO Auto-generated method stub
		super.deva();
	}

	/*	Can we Override static methods in java? 
	We can declare static methods with the same signature in the
	subclass, but it is not considered overriding as there won’t be
	any run-time polymorphism. Hence the answer is ‘No’. 
	
	
	If a derived class defines a static method with the same signature
	 as a static method in the base class, the method in the derived class
	 is hidden by the method in the base class. for more visit javatpoint 
	 */ 
	 
//#imp	Cannot use ###super in a static context

	protected static void logi() {  
		System.out.println("derived class:wife");    

	}		

	@Override
	void gopi() {
		// TODO Auto-generated method stub
		super.gopi();

		Statictest.logi(2);
	}


	public static void main(String[] args) {
		logi();
		Statictest1 s =new Statictest1();
		s.gopi();
		
//		Statictest t=new Statictest1();
//		t.logi();
	}

}
