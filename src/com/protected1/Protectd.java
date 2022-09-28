package com.protected1;

import com.oops.Statictest;

public class Protectd extends Statictest {

	public static void main(String[] args) {
		Protectd a=new Protectd();
		a.deva();
		a.c=10;
		System.out.println(a.c);
		logi();       
		logi(100);
	}

}

