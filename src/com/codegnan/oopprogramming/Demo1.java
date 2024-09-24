package com.codegnan.oopprogramming;
// animal class(super class)
class Animal {
	public void makeSound() {
		System.out.println(" some sound");
	}
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is barking");
    }
	public void fetch() {
		System.out.println("feteching a ball");	
	}
}
	// cat class(sub class of animal)
	class Cat extends Animal{
		public void makeSound() {
			System.out.println("meow");	
		}
	
	public void  scratch() {
		System.out.println("Scratching furniture");	
	}
}
public class Demo1 {
	public static void main(String[] args) {
		//upcasting 
		Animal Animal1 = new Dog();// upcasting dog to animal
		Animal Animal2 = new Cat();// upcasting cat to animal
		// downcasting
		if(Animal1 instanceof Dog) {
			Dog dog = (Dog) Animal1;
			dog.fetch();
		}
		Animal1.makeSound();
		Animal2.makeSound();

	}
}

