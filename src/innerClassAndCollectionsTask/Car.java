package innerClassAndCollectionsTask;

// question 1

public class Car {
	
	public void carName() {
		System.out.println("Car Name : BMW");
	}
	
	class Engine {
		public void engineType() {
			System.out.println("Engine Type : Petrol");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		Car.Engine engine = car.new Engine();
		
		car.carName();
		engine.engineType();
		

	}

}
