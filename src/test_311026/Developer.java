package test_311026;

// question 12

public class Developer extends EmployeeManagement{

	int salary;
	public Developer(int empId, String name, int salary) {
		super(empId, name);
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		
	}
	
	public static void main(String [] args) {
		EmployeeManagement employee = new Developer(002, "Vishnu", 23000);
		employee.display();
	}
	
}
