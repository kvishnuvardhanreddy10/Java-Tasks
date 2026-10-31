package test_311026;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		
		student1.setName("Vishnu");
		student1.setAge(22);
		student1.setMarks(89);
		
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getMarks());
		
		System.out.println();
		
		Car car1 = new Car();
		car1.carDetails("BMW");
		car1.features("Model 001", "Car");
		
		System.out.println();
		
		Calculator calculator1 = new Calculator();
		calculator1.add(10, 12);
		calculator1.add(10, 15, 40);
		calculator1.add(10.35d, 20.47);
		
		System.out.println();
		
		ChildClass child = new ChildClass();
		child.display("Hi, ", "Good");
				
	}

}
