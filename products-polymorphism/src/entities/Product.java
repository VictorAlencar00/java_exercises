package entities;

public class Product {
	private double price;
	private String name;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Product(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String priceTag() {
		return (name + ": $ " + price);
	}

}
