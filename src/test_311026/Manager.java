package test_311026;

// question 12

public class Manager extends EmployeeManagement{
	
	String dept;
	
	public Manager(int empId, String name, String dept) {
		super(empId, name);
		this.dept = dept;
		
	}
	
	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee dept : " + dept);
		
	}
	
	public static void main(String [] args) {
		EmployeeManagement employee = new Manager(001, "Badri", "IT");
		employee.display();
	}

}
