package com.oops;

public class ConstrChild extends ConstrParent {

	public ConstrChild() {
	super();				//bydefault super.constrParent(); is called
	System.out.println("Child:Default Con");
	}

	ConstrChild(int a){
	super(50);	
		System.out.println("Child: Parametrized: "+a);
	}
	
	public static void main(String[] args) {
		
		ConstrChild b=new ConstrChild();
		ConstrChild b1=new ConstrChild(20);

		
		
}
}