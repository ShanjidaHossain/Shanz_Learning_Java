package arraylist;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrList_UserDefined {

	public static void main(String[] args) {
		Cuny s1 = new Cuny("Shanjida", 25 );
		Cuny s3 = new Cuny("Hossain", 52);

		ArrayList<Cuny> s =  new ArrayList<> ();
		s.add(s1);
		s.add(s3);
		
		System.out.println("Size of the Array: " + s.size()); // should be 11
		
		ListIterator<Cuny> i =  s.listIterator();
		while(i.hasNext()) {
			Cuny currentCuny = i.next();
			System.out.println(currentCuny.name + " , " + currentCuny.age);
		}	
	}
}
