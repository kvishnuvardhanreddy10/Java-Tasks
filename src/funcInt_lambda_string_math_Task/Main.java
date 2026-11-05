package funcInt_lambda_string_math_Task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is for question 1
		Student student = (String st_name, int age, String dept) -> {
			System.out.println("Student Name: " + st_name);
			System.out.println("Age: " + age);
			System.out.println("Department: " + dept);
		};
		
		student.display("Anand", 22, "Java");
		
		System.out.println();
		
		// This is for question 2
		Calculator add = (int a, int b)-> a+b;
		Calculator sub = (int a, int b)-> a-b;
		Calculator mult = (int a, int b)-> a*b;
		Calculator div = (int a, int b)-> a/b;
		
		System.out.println("Addition: " + add.calculate(20, 10));
		System.out.println("Subtraction: " + sub.calculate(20, 10));
		System.out.println("Multiplication: " + mult.calculate(50, 4));
		System.out.println("Division: " + div.calculate(10, 5));
		
	}

}
