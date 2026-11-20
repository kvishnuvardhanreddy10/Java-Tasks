package multithreadTask;

// question 4

public class Student {
	
	boolean exampublished = false;
	
	synchronized void student(String name) {
		
		
		try {
			
		System.out.println(name + " is waiting for exam results...");
		
		while(!exampublished) {
			
				wait();
			} 
		System.out.println(name + " result publisted");
		}
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	synchronized void teacher() {

        exampublished = true;

        System.out.println("Teacher published the exam results...");

        notifyAll();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		
		Thread t1 = new Thread(()->{
			student.student("Student 1");
		});
		
		Thread t2 = new Thread(()->{
			student.student("Student 2");
		});
		
		Thread t3 = new Thread(()->{
			student.student("Student 3");
		});
		
		Thread t4 = new Thread(()->{
			student.teacher();
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
