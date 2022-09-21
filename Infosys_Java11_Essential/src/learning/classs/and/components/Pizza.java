package learning.classs.and.components;
class Pizza {

    //Attributes
    int price; 
	String size;
	int quantity;
	
	//Constructor
	Pizza (String size, int quantity){ 
		this.size = size;
		this.quantity = quantity;
		
		if(this.size.equals("Regular"))
			this.price = 100;
		else if(this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
	}
	
	//Method
	public float calculateTotalPrice(Pizza[] pizzaOrdered) {
		int totalPrice = 0;
		for (Pizza pizza : pizzaOrdered) {
			totalPrice += pizza.price * pizza.quantity;
		}
		return 0.95f*totalPrice;
	}
	
}
