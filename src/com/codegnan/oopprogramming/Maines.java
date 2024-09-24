package com.codegnan.oopprogramming;
interface CanRun {
	public abstract void run();
}
interface CanClimb{
	public abstract void climb();
}
class Monkey implements CanRun,CanClimb{
public void climb() {
	System.out.println("monkey is climbing");	
}

public void run() {
	System.out.println("monkey is running");
}	
}
 class Cheetah implements CanRun{	
	public void run() {
		System.out.println("cheetah is running faster");		
	}
 }
 public class Maines{
	 public static void main(String[] args) {
		 Cheetah cheetah = new Cheetah();
		 cheetah.run();
		 Monkey monkey = new Monkey();
		 monkey.run();
		 monkey.climb();
	 }
 }
