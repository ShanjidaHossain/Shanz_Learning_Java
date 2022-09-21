package programming.challenge;

import java.util.LinkedList;

public class Linked_List_Reverse {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<>();

		lst.add(1);
		lst.add(2);
		lst.add(3);
		System.out.println(lst);

		LinkedList<Integer> rlst = new LinkedList<>();

		lst.descendingIterator().forEachRemaining(rlst::add);

		System.out.println(rlst);

	}

}
