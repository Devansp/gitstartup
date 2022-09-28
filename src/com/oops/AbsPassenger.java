package com.oops;

public class AbsPassenger extends AbsBus {

	@Override
	public void barathipvtbus() {
		System.out.println("barathi road ways:paid");		
	}

	@Override
	public void apspvtbus() {
		System.out.println("aps road ways:paid");		
		
	}

	
	
public static void main(String[] args) {
	
	AbsPassenger p=new AbsPassenger();
	p.barathipvtbus();
	p.apspvtbus();
	p.govbus();	
	}		
}


