package com.codegnan.oopprogramming;
public class Humans {
	//private int age = 13;
	//private String name="codegnan";
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		Humans human1=new Humans();
		//human1.age=14;
		//human1.name="janu";
		//System.out.println(human1.age+"----------------"+human1.name);
		 human1.setAge(20);
		 human1.setName("arjun");
		 System.out.println(human1.getAge() +"------------"+human1.getName());
 
	}
}


