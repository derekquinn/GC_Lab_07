package gC_lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab7_02 {
	public static void main(String[] args) {

		String userName = ""; // [A-Z][A-z]{1,29}
		String userEmail = ""; // \b[\w\.-]+@[\w\.-]+\.\w{2,4}\b
		String userPhoneNumber; // \\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b
		String userBirthday; // ^(0[1-9]|[12]\\d|3[01])[\\/\\-\\.](0[1-9]|1[0-2])[\\/\\-\\.](19|20)\\d{2}$

		Scanner scnr = new Scanner(System.in);

		// get name

		System.out.println("Please enter your first name:");
		userName = scnr.nextLine();

		// validate name

		if (nameValidator(userName) == true) {
			System.out.println("Name is valid!");
		}

		while (nameValidator(userName) == false) {
			System.err.println("Sorry, name is not valid!");
			System.out.println("\n");
			System.out.println("Please enter your first name, it's not that hard.");
			userName = scnr.nextLine();

			if (nameValidator(userName) == true) {
				System.out.println("Name is valid!");
			}
		}

		// get email address
		System.out.println("\n");
		System.out.println("Now I require your e-mail address, so I can FWD you junk like it's hot.");
		userEmail = scnr.nextLine();

		// validate email address
		if (emailValidator(userEmail) == true) {
			System.out.println("Email is valid!");
		}

		while (emailValidator(userEmail) == false) {
			System.err.println("Sorry, email is not valid!");
			System.out.println("\n");
			System.out.println("Please enter your REAL e-mail address, this is important.");
			userEmail = scnr.nextLine();

			if (emailValidator(userEmail) == true) {
				System.out.println("Thanks, remember to check your SPAM folder.");
			}
		}
		// get phone number
		System.out.println("\n");
		System.out.println("Give me your phone number, so I can put you on BLAST.");
		userPhoneNumber = scnr.nextLine();

		// validate phone number
		if (phoneValidator(userPhoneNumber) == true) {
			System.out.println("Phone number is valid!");
		}

		while (phoneValidator(userPhoneNumber) == false) {
			System.err.println("Sorry, I need your real phone number.");
			System.out.println("\n");
			System.out.println("Please enter your real phone number. I'm totally going to txt you!!");
			userPhoneNumber = scnr.nextLine();

			if (phoneValidator(userPhoneNumber) == true) {
				System.out.println("Awesome, I'm gonna blow your phone up later.");
			}
		}
		// get birthday
		System.out.println("\n");
		System.out.println("If you tell me your birthday in this format DD/MM/YYYY, I'll get you a cake next year.");
		userBirthday = scnr.nextLine();

		// validate birthday
		if (dateValidator(userBirthday) == true) {
			System.out.println("Can't wait for your birfday.");
		}

		while (dateValidator(userBirthday) == false) {
			System.err.println("Ooopsies");
			System.out.println("\n");
			System.out.println("Please enter your birthday like this DD/MM/YYYY");
			userBirthday = scnr.nextLine();

			if (dateValidator(userBirthday) == true) {
				System.out.println("Can't wait for your birfday.");
			}

		}
	}

	public static boolean nameValidator(String name) {

		if (name.matches("[A-Z][A-z]{1,29}")) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean emailValidator(String eMail) {

		if (eMail.matches("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b")) {
			return true;

		} else {
			return false;
		}

	}

	public static boolean phoneValidator(String phoneNumber) {
		if (phoneNumber.matches("\\d{3}\\-\\d{3}\\-\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean dateValidator(String birthDate) {
		if (birthDate.matches("^(0[1-9]|[12]\\d|3[01])[\\/\\-\\.](0[1-9]|1[0-2])[\\/\\-\\.](19|20)\\d{2}$")) {
			return true;
		} else {
			return false;
		}
	}

}
