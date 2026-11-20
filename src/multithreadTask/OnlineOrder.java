package multithreadTask;

// question 1 

public class OnlineOrder extends Thread {
	
	public void run(){
		
		System.out.println("...Online order started...");
		
		for(int i = 1; i <= 5; i++) {
			
			try {
				System.out.println("Order no : " + i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("...Online order closed...");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		OnlineOrder onlineOrder = new OnlineOrder();
		
		System.out.println("State: " + onlineOrder.getState());
		
		onlineOrder.start();
		
		System.out.println("State after start() : " + onlineOrder.getState());
		
		Thread.sleep(500);
		
		System.out.println("State during sleep() : " + onlineOrder.getState());
		
		onlineOrder.join();
		
		System.out.println("State after completion : " + onlineOrder.getState());
		 
		
	}

}
