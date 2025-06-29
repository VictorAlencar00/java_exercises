package entities;

public abstract class  Contributor {
    private String name;
    private double income;
    private double taxes;

    public Contributor(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public abstract void calcTaxes();

}
