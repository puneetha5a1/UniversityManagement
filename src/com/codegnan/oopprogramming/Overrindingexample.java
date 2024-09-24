package com.codegnan.oopprogramming;
//superclass
class Parents{
	public void property() {
		System.out.println("cash/gold/land/house");
	}
	//overridden method
	public void marry() {
		System.out.println("subbu");
	}
}
//subclass
class  childs extends Parents{
	public void marry() {
		System.out.println("trisha/charmi");
	}	
}
public class Overrindingexample {

	public static void main(String[] args) {
		Parents p1 = new Parents();
		p1.property();
		p1.marry();
		
		childs c1 = new childs();
		c1.property();
		c1.marry();
		Parents p2 = new Parents();
		p2.property();
		p2.marry();
	}
}
