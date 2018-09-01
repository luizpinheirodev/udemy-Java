package aula168.application;

import java.util.Locale;
import java.util.Scanner;

import aula168.services.InterestService;
import aula168.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
//		InterestService is = new BrazilInterestService(2.0);
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment aftter " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		sc.close();
	}

}
