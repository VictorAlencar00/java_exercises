package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    Integer number;
    double value;
    Integer amount;
    LocalDate date;
    List<Installment> installments = new ArrayList<Installment>();

    public Contract(LocalDate date, Integer amount, double value, Integer number) {
        this.date = date;
        this.amount = amount;
        this.value = value;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
