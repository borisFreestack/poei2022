package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String message;
		String message2;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Entrez un message :");
		message = keyboardInput.nextLine();
		System.out.println("Entrez un autre message :");
		message2 = keyboardInput.nextLine();
		int size = message.length();
		System.out.println("Taille du message '" + message + "' : " + size);
		System.out.println("Taille de l autre message '" + message2 + "' : " + message2.length());


	}
}