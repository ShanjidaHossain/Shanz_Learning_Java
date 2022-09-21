package learning.collection.framework.list.generic;
import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivery;
    
    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
    	this.orderId = orderId;
    	this.itemNames = itemNames;
    	this.cashOnDelivery = cashOnDelivery;
    }
    
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
    
}



