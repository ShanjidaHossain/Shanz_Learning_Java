package multithreading;

//Better to use implement interface, which will allow extend to other class. 
public class MultithreadingThing2 implements Runnable {

	private int threadNumber;
	public MultithreadingThing2(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ":  from thread  : " + threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}