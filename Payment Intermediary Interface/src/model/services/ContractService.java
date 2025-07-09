package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        for (int i = 1; i <= months; i++) {
            int paymentDate = 30 * i;
            LocalDate paymentDay = contract.getDate().plusDays(paymentDate);
            double splitValue = (contract.getValue() / months);

            double valueWithFee = splitValue + paymentService.paymentFee(splitValue);
            double valueWithFees = valueWithFee + paymentService.interest(valueWithFee, i);
            contract.getInstallments().add(new Installment(paymentDay, valueWithFees));
        }

    }
}
