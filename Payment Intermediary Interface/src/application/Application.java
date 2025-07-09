package application;


import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int amount = sc.nextInt();

        Contract contract = new Contract(date, amount, value, number);
        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, amount);
        List<Installment> installmentList = contract.getInstallments();
        for (Installment installment : installmentList) {
            System.out.println(installment);
        }
        sc.close();
    }
}

