package com.sqa.rd;

import java.util.*;

public class PetRegistration {
	static String name, n;
	static int count;
	static String[] petNames = new String[2], petAddresss = new String[2], petCitys = new String[2],
			petStates = new String[2], petRegPrices = new String[2], petDOBs = new String[2];
	static Scanner scanner;
	static int noofpets;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);
		initApplication();

		System.out.println("How many pets do you want to register:");
		n = scanner.nextLine();
		noofpets = Integer.parseInt(n);
		count = noofpets;
		registerPet(noofpets);

	}

	public static void registerPet(int i) {
		retrieveUserName();
		retrievePetDetails(i);
		displayPetDetails(i);
		exitApplication();
	}

	private static void displayPetDetails(int no) {
		for (int i = 0; i < no; i++) {
			System.out.println("\nPet 1 Details:");
			System.out.println("---------------------------");
			System.out.println("Name: " + petNames[i]);
			System.out.println("Address: " + petAddresss[i]);
			System.out.println("City: " + petCitys[i]);
			System.out.println("State: " + petStates[i]);
			System.out.println("Birthday: " + petDOBs[i]);
			System.out.println("Registration Price: " + petRegPrices[i]);
		}

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application.");
		System.out.println("Good-bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	private static String obtainString(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	private static void retrievePetDetails(int no) {
		for (int i = 0; i < no; i++) {
			System.out.printf("Enter %d Pets Details", i + 1);
			petNames[i] = obtainString("\nWhat is your pet's name:");
			petAddresss[i] = obtainString("What is " + petNames[i] + "'s address:");
			petCitys[i] = obtainString("What city does he live in:");
			petStates[i] = obtainString("How about the state:");
			petRegPrices[i] = obtainString("How much are registration costs:");
			petDOBs[i] = obtainString("What is " + petNames[i] + "'s birthdate (MM/DD/YYYY):");
		}
	}

	private static void retrieveUserName() {
		System.out.print("Could you please give me your name:");
		name = scanner.nextLine();
	}
}
