package exercicios.exProp.set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exercicios.exProp.set.entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Students> st = new HashSet<>();
		int n = 0;

		System.out.print("How many students for course A? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			st.add(new Students(sc.nextInt()));
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			st.add(new Students(sc.nextInt()));
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			st.add(new Students(sc.nextInt()));
		}

		System.out.println("Total students: " + st.size());

		sc.close();
	}

}
