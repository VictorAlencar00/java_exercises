package entities;

public class Corporative extends Contributor {
    private int employees;

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public Corporative(String name, double income, int employees) {
        super(name, income);
        this.employees = employees;
    }

    @Override
    public void calcTaxes() {
        if (getEmployees() < 10) {
            super.setTaxes(super.getIncome() * 0.16);
        } else {
            super.setTaxes(super.getIncome() * 0.14);
        }
    }
}
