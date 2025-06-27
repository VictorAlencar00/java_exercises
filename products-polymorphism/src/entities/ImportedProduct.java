package entities;

public class ImportedProduct extends Product {
	private double customFee;

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(": $ ");
		sb.append(super.getPrice() + customFee);
		sb.append(" (custom fee: $");
		sb.append(customFee);
		sb.append(")");
		return ("" + sb);
	}

	public ImportedProduct(double price, String name, double customFee) {
		super(price, name);
		this.customFee = customFee;
	}
}
