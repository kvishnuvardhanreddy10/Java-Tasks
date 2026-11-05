package funcInt_lambda_string_math_Task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = (String st_name, int age, String dept) -> {
			System.out.println("Student Name: " + st_name);
			System.out.println("Age: " + age);
			System.out.println("Department: " + dept);
		};
		
		student.display("Vishnu", 22, "Java");
	}

}
