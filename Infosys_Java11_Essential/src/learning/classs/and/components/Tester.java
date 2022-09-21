package learning.classs.and.components;
class Tester {
	
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Medium",4);
		Pizza p2 = new Pizza("Large", 2);
		Pizza[] pizzaOrdered = {p1, p2};
		float totalCost = p1.calculateTotalPrice(pizzaOrdered);
		System.out.println("Your order is ready! Your bill amount is: "+totalCost);
	}
}