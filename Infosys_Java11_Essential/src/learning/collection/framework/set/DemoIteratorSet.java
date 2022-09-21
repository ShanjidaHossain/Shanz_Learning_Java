package learning.collection.framework.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class DemoIteratorSet {
	public static void main(String[] args) {
		//creating a list using asList() of Arrays class
		List<Integer> numList = Arrays.asList(5, 3, 8);	
		
		//converting list to HashSet
		Set<Integer> hset = new HashSet<Integer>(numList);
		
		//creating iterator object over a set using iterator() method
		Iterator<Integer> setIterator = hset.iterator();
		
		//using hasNext() method to find if next element is present
		while(setIterator.hasNext()) {
			//using next() method to get the next element
			System.out.println(setIterator.next());
		}
	}
}
