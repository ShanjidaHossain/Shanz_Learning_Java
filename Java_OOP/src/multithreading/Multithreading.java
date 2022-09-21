package multithreading;

public class Multithreading {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			MultithreadingThing myThing = new MultithreadingThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			System.out.println(myThread.isAlive());
			try {
				myThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
