package OOP.Concept.Part1;


public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.testSum(x, y); // call or pass by value
		int z = obj.testSum(10, 20);	
		System.out.println(z);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
	}
	
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}
	
	//Call by reference
	public void swap (CallByValueAndCallByReference t) {
		int temp;
		temp = t.p; // temp 50
		t.p = t.q; // t.p = 60
		t.q = temp; //t.q = 50
		
		
	}
	public void swap(int p, int q) {
		this.p = p;
		this.q = q;
		
	}

}
