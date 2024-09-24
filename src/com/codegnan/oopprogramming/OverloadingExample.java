package com.codegnan.oopprogramming;

public class OverloadingExample {
public int add(int a,int b) {
	return a+b;
}
public int add(int a,int b,int c) {
	return a+b+c;
}
public double add(double a,double b) {
	return a+b;
}
public int add(int []numbers) {
	int sum =0;
	for (int num:numbers) {
		sum = sum+num;
	}
	return sum;
}
public double add(double a,double b ,double c) {
	return a+b+c;
}
	public static void main(String[] args) {
		OverloadingExample example = new OverloadingExample();
		System.out.println("sum of 5 and 3 is : " +example.add(5,3));
		System.out.println("sum of 5 and 3 and 2 is : " +example.add(5,3,2));
		System.out.println("sum of 2.5 and 3.5  is : " +example.add(2.5,3.5));
		System.out.println("sum of 2.5 and 3.5 and 5.5 is :" +example.add(2.5,3.5,5.5));
		int [] numbers= {10,20,30,40,50};
		System.out.println("sum of array elements is :" +example.add(numbers));
	}
}


