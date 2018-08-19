package exercicios.exercicioFix.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicioFix.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.printf("%nHow many dollars will be bought? ");
		double qtd = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.convertDollars(price,  qtd));
		
		sc.close();
	}

}
