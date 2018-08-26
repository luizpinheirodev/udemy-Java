package exercicios.exercicioAbstrato.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicioAbstrato.entities.Company;
import exercicios.exercicioAbstrato.entities.Individual;
import exercicios.exercicioAbstrato.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExp));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTax = 0.00;
		for(TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			totalTax += t.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));
		
		sc.close();
	}

}
