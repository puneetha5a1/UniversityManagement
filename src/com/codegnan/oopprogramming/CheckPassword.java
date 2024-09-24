package com.codegnan.oopprogramming;

import java.util.Scanner;

interface PasswordChecker{
	public abstract String checkLength(String password);
	public abstract String checkComplexity(String password);
}
class SimplePasswordChecker implements PasswordChecker{

	public String checkLength(String password) {
		
		
		return ("length:"+password.length());
	}

	public String checkComplexity(String password) {
		if(password.length()<8) {
			return "weak";
		}
		else if(password.length()==8) {
			return"medium";
		}
		else {
			return "strong";
		}
		
		
	}
	
}
public class CheckPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a password : ");
		String password = scanner.nextLine();
		PasswordChecker simpleChecker = new SimplePasswordChecker();
		System.out.println(simpleChecker.checkLength(password));
		System.out.println(simpleChecker.checkComplexity(password));
		
	
	}

}
