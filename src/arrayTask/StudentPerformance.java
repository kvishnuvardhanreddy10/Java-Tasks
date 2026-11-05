package arrayTask;

import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[][] marks = new int[3][4];
		
		 int total;
	     int highest;
	     int overallTopper = 0;
	     
	     
	     for(int i = 0; i < marks.length; i++) {
	    	 System.out.println("Enter marks for Class " + (i + 1));
	    	 
	    	 for(int j = 0; j < marks[i].length; j++) {
	    		 System.out.print("Enter marks of Student " + (j + 1) + ": ");
	             marks[i][j] = sc.nextInt();
	    	 }
	     }
	     
	     System.out.println("\n----- Student Marks -----");
	     
	     for(int i = 0; i < marks.length; i++) {
	    	 System.out.println("\nClass " + (i + 1));
	    	 
	    	 for(int j = 0; j < marks[i].length; j++) {
	    		 System.out.println("Student " + (j + 1) + ": " + marks[i][j]);
	    	 }
	    	 
	     }
	     
	     for(int i = 0; i < marks.length; i++) {
	    	 total = 0;
	         highest = marks[i][0];
	         
	         for(int j = 0; j < marks[i].length; j++) {
	        	 total = total + marks[i][j];
	        	 
	        	 if(marks[i][j] > highest) {
	        		 highest = marks[i][j];
	        	 }
	        	 
	        	 if(marks[i][j] > overallTopper) {
	        		 overallTopper = marks[i][j];
	        		 
	        	 }
	         }
	         
	         System.out.println("\nClass " + (i + 1) + " Total Marks: " + total);
	         System.out.println("Class " + (i + 1) + " Highest Marks: " + highest);
	     }
	     
	     System.out.println("\n----- Overall Topper -----");

	     System.out.println("Highest Mark: " + overallTopper);
	}
}
