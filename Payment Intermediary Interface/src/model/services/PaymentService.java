package model.services;

public interface PaymentService {
    double paymentFee(double value);

    double interest(double value, int month);
}
