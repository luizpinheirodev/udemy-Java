package funcoes;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();

	}

	private static void showResult(int higher) {
		System.out.println(higher);
	}

	private static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;
	}

}
