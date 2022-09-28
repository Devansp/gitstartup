package com.oops;

public class Thiskeyword {

	int a=50;
	
	private void getdata() {
	int	a=20;
	int b=30;
		System.out.println("Local variable "+a);
		int c=a+this.a;
		System.out.println("Addition of instance and local variable: " + c  );
		System.out.println(a+b);
	//	System.out.println("local and instance add: "+ a+this.a);// todo
		System.out.println(a+this.a);
	}
	
	public static void main(String[] args) {
		Thiskeyword t=new Thiskeyword();
//		System.out.println("main method call instance/global vari "+t.a);
		t.getdata();
		
	}
}
