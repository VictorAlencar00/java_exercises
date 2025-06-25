package entities;

public class OrderItem {
	private int quantity;
	private double subtotal;
	private Product product;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		this.subtotal = (product.getPrice() * quantity);
		return subtotal;
	}

	public OrderItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append("quantity: " + quantity + " ");
		sb.append("subtotal: " + getSubtotal());
		return sb.toString();
	}
}