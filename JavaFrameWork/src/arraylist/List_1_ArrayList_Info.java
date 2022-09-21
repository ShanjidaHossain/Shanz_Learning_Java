package arraylist;

/*
 ArrayList Class
 
implements the List interface
uses a dynamic array
duplicate element
different data types (Heterogeneous elements are allowed)
maintains the insertion order (insertion order will be preserved ->will print as you add)
**non-synchronized :
		Not thread safe: as of now you've used the main thread


elements stored in the ArrayList class can be randomly accessed (by using get(index)
stores values in the basis of index
null insertion is possible (String)
 
Need to cover:
->add(), size(), get()
->get all values by using for loop, iterator()
->generic and non generic
->user-defined class obj
->addAll()
->removeAll()
->how array is fixed but ArrayList not
->why ArrayList is slow
*in case of adding element and removing element?for shifting needs time
->ArrayList is better choice 
*for data retrieval 
ar.get(0);----for example it will take 1 m.sec
ar.get(1000)-- -- it will take 1 m.sec too
RandomAccess  (marker Interface- no method available) Interface is implemented by ArrayList

 *
 */

public class List_1_ArrayList_Info {
	 public void add() {
		System.out.println(5+5);
	}
	 
public static void main(String[]args) {
	
	List_1_ArrayList_Info objArrayList_Info =new List_1_ArrayList_Info();
	objArrayList_Info.add();
	
}
}