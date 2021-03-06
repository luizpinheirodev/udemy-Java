package exercicios.exercicioList.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicioList.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.printf("%nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee name = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (name != null) {
			System.out.printf("Enter the percentage: ");
			double percentage = sc.nextDouble();
			name.increaseSalary(percentage);
		}else {
			System.out.println("This employee does not exist.");
		}
		
		System.out.println("List of employees: ");
		for(Employee x : employees) {
			System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
		}

		sc.close();
	}

}
