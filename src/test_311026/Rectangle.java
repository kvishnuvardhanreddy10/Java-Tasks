package test_311026;

import java.util.Scanner;

//question 13
public class Rectangle extends Shape{

	Scanner sc = new Scanner(System.in);
	@Override
	void calculateArea() {
		
		System.out.println("Enter length : ");
		
		int length = sc.nextInt();
		
		System.out.println("Enter width : ");
		
		int width = sc.nextInt();
		
		int rect = length*width;
		
		System.out.println("Rectangle area : " + rect );
		
	}
	
	public static void main(String [] args) {
		Shape rect = new Rectangle();
		rect.calculateArea();
	}

}
