package arraylist;


public class ArrayList_MultiThread {

	int count;

	public void increment() {
		count++;
	}

	public static void main(String[] args) throws Throwable {

		System.out.println("Example2 : Showing what is Multiple thread.");

		ArrayList_MultiThread o = new ArrayList_MultiThread();

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
