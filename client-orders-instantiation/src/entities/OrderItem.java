package entities;

public class OrderItem {
	private int quantity;
	private double subvalue;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubvalue() {
		return subvalue;
	}

	public void setSubvalue(double price) {
		this.subvalue = (price * quantity);
	}

	public OrderItem(int quantity) {
		super();
		this.quantity = quantity;
	}
}