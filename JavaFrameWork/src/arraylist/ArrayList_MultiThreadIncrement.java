package arraylist;


public class ArrayList_MultiThreadIncrement {

	int count;

	//Synchronized in serialized way
	public synchronized void increment() {//if not synchronized that some may skip while going over the object fast
		count++; 
	}

	public static void main(String[] args) throws Throwable {

		System.out.println("Example2 : Showing what is Multiple thread.");

		ArrayList_MultiThreadIncrement o = new ArrayList_MultiThreadIncrement();

		// Create Thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					o.increment();
				}
			}
		});

		// Another Thread
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					o.increment();
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(o.count);

	}

}
