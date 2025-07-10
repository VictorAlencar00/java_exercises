package model.services;

public class PayPalService implements PaymentService {
    @Override
    public double paymentFee(double value) {
        return value * 0.02;
    }

    @Override
    public double interest(double value, int month) {
        return value * (0.01 * month);
    }
}
