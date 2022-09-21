package learning.collection.framework.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
class DemoSet {
	public static void main(String[] args) {
		
		//The following code demonstrates, 
		// how to create and initialize the various types of the set like 
		// HashSet, TreeSet and LinkedHashSet. 
		//  This code further makes you understand the method of storing elements in each type of the set.
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(45);
		hs.add(1);
		hs.add(85);
		System.out.println(hs);//elements will be printed in random order
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(45);
		ts.add(1);
		ts.add(85); //elements will be printed in sorted order
		System.out.println(ts);
		Set<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(5);
		ls.add(45);
		ls.add(1);
		ls.add(85);
		ls.add(85);
		System.out.println(ls);//elements will be printed in insertion order
	}
}
