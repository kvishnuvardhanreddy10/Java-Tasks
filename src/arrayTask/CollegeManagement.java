package arrayTask;

import java.util.Scanner;

public class CollegeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

        int[][][] marks = new int[2][2][3];

        int total;
        int highestDepartment;
        int overallHighest = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Department " + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.println("Class " + (j + 1));

                for (int k = 0; k < 3; k++) {
                    System.out.print("Enter marks of Student " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("----- Student Marks -----");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.println("Class " + (j + 1));

                for (int k = 0; k < 3; k++) {
                    System.out.println("Student " + (k + 1) + ": " + marks[i][j][k]);
                }
            }
        }
     
        for (int i = 0; i < 2; i++) {
            highestDepartment = marks[i][0][0];
            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {
                total = 0;

                for (int k = 0; k < 3; k++) {
                    total = total + marks[i][j][k];

                    if (marks[i][j][k] > highestDepartment) {
                        highestDepartment = marks[i][j][k];
                    }
                   
                    if (marks[i][j][k] > overallHighest) {
                        overallHighest = marks[i][j][k];
                    }

                }

                double average =  total / 3;

                System.out.println("Class " + (j + 1) + " Average: " + average);

            }

            System.out.println("Department Highest Mark: " + highestDepartment);

        }

        System.out.println("----- Overall Highest Mark -----");
        System.out.println("Overall Highest Mark: " + overallHighest);
	}

}
