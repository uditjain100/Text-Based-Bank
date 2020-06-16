package Text_Files;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_01_Output {

	public static Scanner scn = new Scanner(new InputStreamReader(System.in));

	private static ArrayList<Double> usersBalance = new ArrayList<Double>();
	private static ArrayList<String> usersName = new ArrayList<String>();
	private static int size = 0;

	public static void main(String[] args) {

		for (; true;) {
			System.out.println();
			System.out.println("Bank Admin Menu");
			System.out.println("Please enter a menu Option - ");
			System.out.println("[1] - Add Customer to the bank");
			System.out.println("[2] - Change Customer Name");
			System.out.println("[3] - Check Account Balance");
			System.out.println("[4] - Modify Account Balance");
			System.out.println("[5] - Summary of all Accounts");
			System.out.println("[-1] - Quit");

			int userInput = scn.nextInt();

			if (userInput == 1) {
				addUser();
			} else if (userInput == 2) {
				changeName();
			} else if (userInput == 3) {
				checkBalance();
			} else if (userInput == 4) {
				modifyBalance();
			} else if (userInput == 5) {
				accountSummary();
			} else if (userInput == -1) {
				System.exit(-1);
			} else {
				System.out.println("ERROR : Invalid Input");
			}
		}

	}

	private static void addUser() {
		System.out.println("Bank Add Customer Menu : ");
		System.out.println("Please enter an User account Balance - ");
		double balance = scn.nextDouble();
		usersBalance.add(size, balance);
		System.out.println("Please enter an User Name - ");
		scn.nextLine();
		String userName = scn.nextLine();
		usersName.add(size, userName);
		System.out.println("Customer ID is -> " + size);
		size++;
	}

	private static void changeName() {
		System.out.println("Bank Change Name Menu : ");
		System.out.println("Please enter Customer ID -> ");
		int customerId = scn.nextInt();
		System.out.println("Please enter User new Name -> ");
		scn.nextLine();
		String newName = scn.nextLine();
		usersName.set(customerId, newName);
	}

	private static void checkBalance() {
		System.out.println("Bank Check Balance Mebu : ");
		System.out.println("Please Enter the Customer ID -> ");
		int customerId = scn.nextInt();
		System.out.println("Your Account Balance is -> " + usersBalance.get(customerId));
	}

	private static void modifyBalance() {
		System.out.println("Bank Modify Balance Menu : ");
		System.out.println("Please enter Customer ID -> ");
		int customerId = scn.nextInt();
		System.out.println("Please enter new Balance -> ");
		double newBalance = scn.nextDouble();
		usersBalance.set(customerId, newBalance);

	}

	private static void accountSummary() {
		System.out.println("Bank Account Summary Menu : ");
		for (int i = 0; i < size; i++) {
			System.out.println("Customer ID : " + i + " , Customer Name : " + usersName.get(i)
					+ " , Customer Balance : " + usersBalance.get(i));
		}
	}

}
