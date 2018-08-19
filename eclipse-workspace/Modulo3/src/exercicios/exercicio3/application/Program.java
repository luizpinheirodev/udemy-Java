package exercicios.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicio3.entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		System.out.println(st.toString());
		
		sc.close();
	}

}
