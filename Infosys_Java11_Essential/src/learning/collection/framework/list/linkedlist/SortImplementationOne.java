package learning.collection.framework.list.linkedlist;

import java.util.Comparator;

// Implementation class for the Comparator interface
class SortImplementationOne implements Comparator<String> {

	//compare method overridden 
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

// Another implementation class for the Comparator interface
class SortImplementationTwo implements Comparator<String> {

	//compare method overridden
	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}