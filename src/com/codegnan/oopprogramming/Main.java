package com.codegnan.oopprogramming;
class Parent {
	public void methodOne() {
		System.out.println("parent class m1 method");
	}
}
class Child extends Parent{
	public void methodTwo() {
		System.out.println("Child class m2 method");		
	}
}
public class Main {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.methodOne();
		//p1.methodTwo();
		Child c1 = new Child();
		c1.methodOne();
		c1.methodTwo();
		Parent p2 = new Child();
		p2.methodOne();
	}
}

