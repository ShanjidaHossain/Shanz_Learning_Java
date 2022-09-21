package arraylist;

public class ArrayList_MainThread {

	public static void main(String[] args) {
		
		System.out.println("Showing what is main thread.");
		int[] arr = { 5, 8, 9, 10, 22 };
		//System.out.println(arr[6]);// out of bound
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		 * Index 6 out of bounds for length 5 at 
		 * com.java.framework.collection.array.arraylist.ArrayList_Non_Sync.main(
		 * ArrayList_Non_Sync.java:7)
		 */
		
		System.out.println("Example2 : Showing what is main thread.");
		
		ArrayList_MainThread o = new ArrayList_MainThread();
		o.increment();
		o.increment();
		System.out.println(o.count);
		
	}
	
	int count;
	public void increment() {
		count ++;
	}

}
