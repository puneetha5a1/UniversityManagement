package com.codegnan.oopprogramming;
//method1 without return type without parameters
public class MethodDemo {
	public void greet() {
		System.out.println("hello jfs-12 good morning");
	}
	// without return type with parameters
	public void printSum(int a,int b) {
		int sum = a+b;
		System.out.println("the sum is : "+sum);	
	}
	// with return type with parameters
	public int multiply(int a,int b) {
		
		return a*b;	
	}
	// with return type without parameters
	public String wish() {
		return"hello puneetha how are you";	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo demo = new MethodDemo();
		demo.greet();
		demo.printSum(10,20);
		// when the return type is called then u need to declare the variables and print the result.
		int result = demo.multiply(20,30);
		System.out.println("multiplication result :"+result);
		String wish=demo.wish();
		System.out.println(wish);
	}
}

