package arrayTask;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[10];
		
		int highest, lowest;
		int total = 0;
		int pass = 0;
		int fail = 0;
		double average;
		
		for(int i = 0; i < marks.length; i++) {
			System.out.print("enter marks of student " + (i+1) +" : ");
			marks[i] = sc.nextInt();
		}
		
		highest = marks[0];
		lowest = marks[0];
		
		System.out.println("--- Student marks ---");
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Student " + (i+1) + " : " + marks[i]);
			
			total = total + marks[i];
			
			if(marks[i] > highest) {
				highest = marks[i];
			}
			
			if(marks[i] < lowest) {
				lowest = marks[i];
			}
			
			if(marks[i] >= 35) {
				pass++;
			}else {
				fail++;
			}
		}
		
		average = total / marks.length;
		
		System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);
		
		
	}

}
