package exercicios.exercicioVetor.appication;

import java.util.Scanner;

import exercicios.exercicioVetor.entities.Room;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int num = sc.nextInt();
		
		Room vect[] = new Room[10];
		for(int i = 0;i<num; i++) {
			System.out.println("Rent #" + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.printf("%nEmail: ");
			String email = sc.nextLine();
			System.out.printf("%nRoom: ");
			int room = sc.nextInt();
			vect[room] = new Room(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0;i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		
		
		sc.close();
	}

}
