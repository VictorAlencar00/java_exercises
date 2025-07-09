package model.services;

public class PayPalService implements PaymentService {
    public double paymentFee(double value) {
        return value * 0.02;
    }

    public double interest(double value, int month) {
        return value * (0.01 * month);
    }
}
