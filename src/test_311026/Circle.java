package test_311026;

import java.util.Scanner;

// question 13

public class Circle extends Shape{

	Scanner sc = new Scanner(System.in);

	double pi = 3.14d;
	@Override
	void calculateArea() {
		
		System.out.println("Enter radius : ");
		
		int radius = sc.nextInt();
		 double circle = (pi*radius*radius);
		 
		 System.out.println("Circle Area : " + circle);
	}
	

	public static void main(String [] args) {
		Shape circle = new Circle();
		circle.calculateArea();
	}
	
}
