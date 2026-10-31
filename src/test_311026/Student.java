package test_311026;

public class Student {
	
	// For this scenario we have use encapsulation. we use private key for the given variable. so we cannot access from other class.
	// if we wants to access those variable we have to create setters and getters, so then we can access from other class.
	
	private String name;
	private int age;
	private int marks;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMarks(int marks ) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMarks() {
		return marks;
	}
	
}
