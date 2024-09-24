package com.codegnan.oopprogramming;
public class Person {
	//instance variables
	String name;
	int age;
	//constructor to initialize name and age
	public Person(String name,int age) {
		this.name= name;
		this.age= age;
	}
	//copy constructor
	public Person(Person anotherPerson) {
		this.name = anotherPerson.name;
		this.age = anotherPerson.age;
	}
	// method to display person details
	public void displayDetails() {
		System.out.println("Name is : " + name);
		System.out.println("age  is : " + age);
		
	}
	public static void main(String[] args) {
		//creating a person object using the constructor
		Person person1=new Person("alice",32);
		System.out.println("Person1Details");
		person1.displayDetails();
		System.out.println();
		//creating another person object using the copy constructor
		Person person2=new Person(person1);
		//displayDetails of person2
		System.out.println("details of Person2(Copy of Person1)");
		person2.displayDetails();
	}
}

