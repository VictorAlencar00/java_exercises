package entities;

public class Private extends Contributor{

    private double healthExpenses;
    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }


    public Private(String name, double income, double healthExpenses) {
        super(name, income);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public void calcTaxes() {
        if (!(super.getIncome() > 20000)) {
            super.setTaxes(((super.getIncome() * 0.15) - getHealthExpenses() * 0.5));
        } else {
            super.setTaxes(((super.getIncome() * 0.25) - getHealthExpenses() * 0.5));
        }
    }
}
