package application;

import java.util.Scanner;

import entities.Room;

public class Program_room {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		Room[] vect = new Room[9];

		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d: %n", i+1);
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int number = sc.nextInt();
			vect[number] = new Room(name, email, number);	
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}

		sc.close();
	}

}