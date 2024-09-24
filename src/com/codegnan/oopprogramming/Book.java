package com.codegnan.oopprogramming;
//overloaded constructors
public class Book {
	// instance variables
	String title;
	String Author;
	String  isbnno;
	double price;
	public Book(String title, String author, String isbnno, double price) {		
		this.title = title;
		Author = author;
		this.isbnno = isbnno;
		this.price = price;
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		Author = author;
	}
	public Book(String title, String author, String isbnno) {
		super();
		this.title = title;
		Author = author;
		this.isbnno = isbnno;
	}
public void displayInfo() {
	System.out.println("title:"+title+"author:"+Author+"isbn:"+isbnno+"price:"+price);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("java programming","john","978-0123456",500);
		System.out.println("book1details");
		book1.displayInfo();
		Book book2= new Book("python","robot","789-123467");
		System.out.println("book2details");
		book2.displayInfo();
		Book book3=new Book("c programming","dany");
		System.out.println("book3details");
		book3.displayInfo();
	}
}
