package conditionTasks;

import java.util.Scanner;

public class CheckPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter u r Number : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("The number is positive");
		}
	}

}
