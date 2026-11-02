package conditionTasks;

import java.util.Scanner;

public class CheckLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.print("enter 2nd number : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
		    System.out.println(num1 + " is the largest number");
		} else if (num2 > num1) {
		    System.out.println(num2 + " is the largest number");
		} else {
		    System.out.println("Both numbers are equal");
		}
	}

}
