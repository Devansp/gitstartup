package com.oops;

public class Childpoly extends Parentpoly {

	int speed=50;
		
	@Override
	public void display() {
		System.out.println("Child: "+speed);
		System.out.println("super called: "+super.speed );
	}
	
	
	public static void main(String[] args) {
		Childpoly c=new Childpoly();
		c.display();
		Parentpoly p=new Parentpoly();
		p.display();
		Parentpoly d=new Childpoly();   //upcasting possible
		d.display();				//downcasting notpossible
		method();					//calling static direct 
		Parentpoly.method();	//calling static by using class name.method
		c.method(); 		//calling parent in child by inherit
	}
	
	
}
