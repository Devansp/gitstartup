package com.oops;

public class Bikesub implements BikeInter {

	@Override
	public void royalenfield() {
		System.out.println("RoyalEnfield: Comfortable for long Journey");
	}

	@Override
	public void bmw() {
		System.out.println("BMW: Costlier and Comfortable bike");
	}

	public static void main(String[] args) {
		Bikesub b=new Bikesub();
		b.royalenfield();
		b.bmw();
	}
	
	
}

