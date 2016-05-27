package com.sqa.rd;

import java.util.*;

public class PetRegistration {
	static String name;
	static int petCount;
	static String[] petNames, petAddresses, petCities, petStates, petRegPrices, petDOBs;
	static Scanner scanner;

	public static void main(String args[]) {
		registerPet();
	}

	public static void registerPet() {
		initApplication();
		retrieveUserName();
		retriveNumberOfPets();
		initPetDetailArray();
		retriveAllPetDetail();
		displayAllPetDetails();
		exitApplication();
	}

	private static void displayAllPetDetails() {
		for (int i = 0; i < petCount; i++) {
			displayPetDetails(i);
		}
	}

	private static void displayPetDetails(int petIndex) {
		System.out.println("Pet#" + (petIndex + 1) + "Details");
		System.out.println("---------------------------------");
		System.out.println("Name: " + petNames[petIndex]);
		System.out.println("Address: " + petAddresses[petIndex]);
		System.out.println("City: " + petCities[petIndex]);
		System.out.println("State: " + petStates[petIndex]);
		System.out.println("Birthday: " + petDOBs[petIndex]);
		System.out.println("Registration Price: " + petRegPrices[petIndex]);
		System.out.println("---------------------------------");

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application.");
		System.out.println("Good-bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	private static void initPetDetailArray() {
		// TODO Auto-generated method stub
		petNames = new String[petCount];
		petAddresses = new String[petCount];
		petCities = new String[petCount];
		petStates = new String[petCount];
		petRegPrices = new String[petCount];
		petDOBs = new String[petCount];
	}

	private static int obtainInt(String question) {
		int value = 0;
		boolean validData = false;
		while (!validData) {
			try {
				System.out.print(question);
				value = Integer.parseInt(scanner.nextLine());
				validData = true;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("you must supply a valid number");
			}
		}
		return value;
	}

	private static String obtainString(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	private static void retrievePetDetails(int petIndex) {
		System.out.println("Pet#" + (petIndex + 1) + "Details");
		System.out.println("---------------------------------");
		petNames[petIndex] = obtainString("What is your pet's name:");
		petAddresses[petIndex] = obtainString("What is " + petNames[petIndex] + "'s address:");
		petCities[petIndex] = obtainString("What city does he live in:");
		petStates[petIndex] = obtainString("How about the state:");
		petRegPrices[petIndex] = obtainString("How much are registration costs:");
		petDOBs[petIndex] = obtainString("What is " + petNames[petIndex] + "'s birthdate (MM/DD/YYYY):");
		System.out.println("---------------------------------");
	}

	private static void retrieveUserName() {
		System.out.print("Could you please give me your name:");
		name = scanner.nextLine();
	}

	private static void retriveAllPetDetail() {

		for (int i = 0; i < petCount; i++) {
			retrievePetDetails(i);
		}
	}

	private static void retriveNumberOfPets() {
		// TODO Auto-generated method stub
		petCount = obtainInt("Enter the number of Pets to be registered");

	}
}
