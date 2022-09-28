package com.oops;

public class ConstrParent {

	
	public ConstrParent() {   //##explicit constructor   //default access modifier is public
		
		System.out.println("Parent:Default Cons. is called");
	
	}

	public ConstrParent(int a){
		
		System.out.println("Parent:Parametrized Cons. is called: "+a);
	
	}	
	
	private void deva() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
	
		ConstrParent a=new ConstrParent(); //whenever we create obj. constructor is called automatically
		
		ConstrParent a1=new ConstrParent(10); //wen constructor is not available, complier will ##implicitivly called constractor to assign values for object(variables and methods) attributes
		
		a.deva();
	//	a1.deva();			//both are same output
		

		
		
	}
}
