package exercicios.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicio2.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.print("Nome: ");
		em.name = sc.nextLine();
		System.out.printf("%nGross Salary: ");
		em.grossSalary = sc.nextDouble();
		System.out.printf("%nTax: ");
		em.tax = sc.nextDouble();
		
		System.out.println("Employee: " + em.toString());
		
		System.out.printf("Which percentage to increase salary?");
		em.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated date: " + em.toString());
				
		sc.close();
	}

}
