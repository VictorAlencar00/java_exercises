package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		return (super.getName() + ": $ " + super.getPrice() + " (manufacture date: " + sdf.format(getManufactureDate()) + ")");
	}

	public UsedProduct(double price, String name, Date manufactureDate) {
		super(price, name);
		this.manufactureDate = manufactureDate;
	}
}
