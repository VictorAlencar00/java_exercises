package entitites;

public class Item {
    private Product product;
    private double amount;
    private double totalPrice;

    public Item(Product product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        totalPrice = product.getPrice() * amount;
        return totalPrice;
    }

    @Override
    public String toString() {
        return product.getName() +
                ", amount=" + getAmount() +
                ", totalPrice=" + getTotalPrice();
    }
}
