package com.codegnan.oopprogramming;
// without using constructors
public class Human {
	// instance variable
	String name;
	int age;
	String gender;
	double height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		human1.name= "codegnan";
		human1.age = 20;
		human1.gender="male";
		human1.height=5.7;
		
		System.out.println("human1 details");
		System.out.println("name : "+human1.name+" age : " +human1.age+ " gender : " +human1.gender+" height : " +human1.height);
		
		Human human2 = new Human();
		human2.name= "sunny";
		human2.age = 30;
		human2.gender="female";
		human2.height=5.9;
		
		System.out.println("human2 details");
		System.out.println("name : "+human2.name+" age : " +human2.age+ " gender : " +human2.gender+" height : " +human2.height);
	}

}

