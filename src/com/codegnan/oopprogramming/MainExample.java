package com.codegnan.oopprogramming;

import java.util.*;

interface Shape1 {
    public abstract double calculateArea();
    public abstract double calculateVolume();
}

class Circle implements Shape1 {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculateVolume() {
        return 0;  // Circle doesn't have a volume
    }
}    

class Rectangle implements Shape1 {
    double length;
    double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double calculateArea() {
        return length * breadth;
    }
    
    @Override
    public double calculateVolume() {
        return 0;  // Rectangle doesn't have a volume
    }
}

class Cylinder implements Shape1 {
    double radius;
    double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;  // Correct formula for cylinder volume
    }
}
public class MainExample {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Volume of circle: " + circle.calculateVolume());
        
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Volume of rectangle: " + rectangle.calculateVolume());
        
        Cylinder cylinder = new Cylinder(3, 7);
        System.out.println("Area of cylinder: " + cylinder.calculateArea());
        System.out.println("Volume of cylinder: " + cylinder.calculateVolume());
    }
}





