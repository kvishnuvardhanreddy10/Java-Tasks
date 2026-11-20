package multithreadTask;

// question 3

public class FoodOrder {
	
	boolean foodReady = false;
	
	synchronized void customer() {
		
		System.out.println("Customer is waiting for food...");
		while(!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
		System.out.println("Food is ready, customer can have the food....");
	}
	
	synchronized void chef() {
		
		 try {
	            System.out.println("Chef preparing food...");
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
		 foodReady = true;

	     System.out.println("Chef prepared the food...");
	        
		notify();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrder foodOrder = new FoodOrder();
		
		Thread t1 = new Thread(()->{
			foodOrder.customer();
		});
		
		Thread t2 = new Thread(()->{
			foodOrder.chef();
		});
		
		t1.start();
		t2.start();
	}

}
