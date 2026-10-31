package test_311026;

public class Implement extends Employee {
	
	private String name;
	private String feedback;
	
	@Override
	public void information(String name, String feedback) {
		this.name = name;
		this.feedback = feedback;
	}

	@Override
	public void display() {
		System.out.println("Name : " + this.name + ", Feedback : " + this.feedback);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implement implement1 = new Implement();
		implement1.information("Badri", "Good");
		implement1.display();
	}

}
