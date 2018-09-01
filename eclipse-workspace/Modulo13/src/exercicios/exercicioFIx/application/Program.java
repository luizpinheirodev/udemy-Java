package exercicios.exercicioFIx.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicioFIx.model.entities.Contract;
import exercicios.exercicioFIx.model.entities.Installment;
import exercicios.exercicioFIx.model.services.ContractService;
import exercicios.exercicioFIx.model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract Value: ");
		double value = sc.nextDouble();
		System.out.print("Enter number of installment: ");
		int installment = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, installment);
		
		System.out.println("INSTALLMENTS:");
		for(Installment iL : contract.getInstallment()) {
			System.out.println(iL);
		}
		
		sc.close();
	}

}
