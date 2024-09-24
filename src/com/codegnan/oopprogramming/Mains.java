package com.codegnan.oopprogramming;
abstract class Vechile{
	public abstract int getNoOfWheels();
}
class Bus extends Vechile{
	public int getNoOfWheels() {
		return 7;
	}
}
class Auto extends Vechile{
	public int getNoOfWheels() {
		return 3;
	}
}
public class Mains {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.getNoOfWheels();
		//Vechile vechile = new Vechile();

	}

}
