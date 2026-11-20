package multithreadTask;

public class ProducerAndConsumer {
	
	boolean productAvailable = false;
    int product = 0;
	
	synchronized void produce() {
        product++;

        productAvailable = true;

        System.out.println("Producer produced product : " + product);

        notify();

        notifyAll();
    }
	
	synchronized void consume(String consumerName) {
        while (!productAvailable) {
            try {
                System.out.println(consumerName + " is waiting for product...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(consumerName + " consumed product : " + product);

        productAvailable = false;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();
		
		Thread producer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                producerAndConsumer.produce();
            }
        });

        Thread c1 = new Thread(() -> {
            producerAndConsumer.consume("Consumer 1");
        });

        Thread c2 = new Thread(() -> {
            producerAndConsumer.consume("Consumer 2");
        });

        Thread c3 = new Thread(() -> {
            producerAndConsumer.consume("Consumer 3");
        });

        c1.start();
        c2.start();
        c3.start();

        producer.start();
	}

}
