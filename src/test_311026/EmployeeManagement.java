package test_311026;

//Question 12

public class EmployeeManagement {
	int empId;
	String name;
	
	public EmployeeManagement(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
	}
}
