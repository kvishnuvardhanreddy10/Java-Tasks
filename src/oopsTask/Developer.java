package oopsTask;

public class Developer extends Employee {
	
	String programmingLanguage;
	
	public Developer(String name, int id, double salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
		}

	 void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: " + salary);
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
}
