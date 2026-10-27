package oopsTask;

public class Student {
	
	void StudentDetails(String name, int rollNo, int mark) {
		System.out.println("Student Name : " + name);
		System.out.println("Student RollNo : " + rollNo);
		System.out.println("Student Mark : " + mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.StudentDetails("Vishnu", 1, 80);
		
		System.out.println();
		System.out.println();
		
		student2.StudentDetails("Leo Messi", 2, 99);
		
		
	}

}
