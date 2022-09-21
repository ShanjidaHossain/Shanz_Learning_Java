package learning.control.structure;

public class Switch_Java {
	public static void main(String[] args) {
		double discount;
		String customerType = "Premium";
		switch (customerType) {
		case "Regular":
			discount = 5;

		case "Premium":
			discount = 10;

		default:
			discount = 0;
		}
		System.out.println("Customer has got discount of " + discount + "%");
	}
}
