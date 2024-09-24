package com.codegnan.oopprogramming;
//using constructor
public class Human1 {
	// instance variables
	String name;
	int age;
	String gender;
	double height;
	public Human1(String name, int age, String gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		System.out.println("constructor");
	}
	//default constructor
	/*public Human1(){
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 human2= new Human1("bunny",30,"male",5.6);
		System.out.println("name : "+human2.name+" age : " +human2.age+ " gender : " +human2.gender+" height : " +human2.height);
		Human1 human3=new Human1("chinny",35,"male",5.5);
		System.out.println("name : "+human3.name+" age : " +human3.age+ " gender : " +human3.gender+" height : " +human3.height);
		Human1 human4=new Human1("vinny",65,"male",5.3);
		System.out.println("name : "+human4.name+" age : " +human4.age+ " gender : " +human4.gender+" height : " +human4.height);
	}
}

