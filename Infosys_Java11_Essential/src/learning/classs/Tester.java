package learning.classs;
// This is the class which creates new Product objects
class Tester {
	public static void main(String[] args) {
		Product p1 = new Product();//declaring new object
		p1.setProductId(1001);//setting attributes with values
		p1.setPrice(400);
		p1.setStock(6);
		
		Product p2 = new Product();
		p2.setProductId(1005);
		p2.setPrice(500);
		p2.setStock(4);
		
		Product p3 = new Product();
	    
        p1.displayDetails();//method call
        System.out.println();
        p3.displayDetails();
	}
}