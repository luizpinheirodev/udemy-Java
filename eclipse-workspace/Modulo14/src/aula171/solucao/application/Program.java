package aula171.solucao.application;

import java.util.Scanner;

import aula171.problema2.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values");
		int n = sc.nextInt();
		
		ps.addValue("Maria");

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			// String value = sc.nextLine();
			ps.addValue(value);
		}
		ps.print();
		Integer x = (Integer) ps.first();
		System.out.println("First: " + x);

		sc.close();
	}

}
