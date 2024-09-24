package com.codegnan.oopprogramming;
//super class
class Vechicle{
	// instance variables
	String brand;
	// constructor for vechile class
	public Vechicle(String brand) {
		this.brand=brand;
		System.out.println("Vechile Constructor");
	}
	public void displayBrand() {
		System.out.println("Brand: "+ brand);
	}
}
//sub class named car extends Vechile. 
class Car extends Vechicle{
	int year;	
	// constructor of a class with brand year
	public Car(String brand, int year) {
		super(brand);// call super class constructor to intilize brand
		this.year=year;
		System.out.println("car constructor");
		
	}
	public Car(String brand) {
		this(brand,2020);//call another constructor of the same class
	}
	// method to display details of the car
	public void displayDetails() {
		super.displayBrand();//call super class method to display brand
		
		System.out.println("Year: "+year);		
	}
}
public class Main1 {
	public static void main(String[] args) {
		Car myCar1 = new Car("toyota",2022);
		Car myCar2 = new Car("Honda");
		//display details of the cars.
		System.out.println("Cars1Details : ");
		myCar1.displayDetails();
		System.out.println("Cars2Details : ");
		myCar2.displayDetails();
		
	}
}
