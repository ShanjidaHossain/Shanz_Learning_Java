package learning.classs;
// Product class
class Product {

    private int productId;
    private float price;
    private int stock;

    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Price: " + price );
    }
    
    public void displayDetails(int discountPercentage) {
    	System.out.println("Product discounted price: "+ this.getPriceAfterDiscount(discountPercentage));
    	if(this.stock>0)
    		 System.out.println("Stock Available");
    	else System.out.println("Stock not available");    	
    }

    public float getPriceAfterDiscount(int discountPercentage) {
        float discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}



