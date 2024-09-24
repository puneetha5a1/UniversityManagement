package com.codegnan.oopprogramming;
public class TabletCapsule {
	//private variables of the tablet capsule class
	private String color;
	private String size;
	private int strength;
	public TabletCapsule(String color, String size, int strength) {
		super();
		this.color = color;
		this.size = size;
		this.strength = strength;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	//method to display information about the capsule
	public void display() {
		System.out.println("TabletCapsule information");
		System.out.println("color:"+color);
		System.out.println("size :"+size);
		System.out.println("strength:"+strength);	
	}
}

