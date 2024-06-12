package casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		boolean  value = true;
		long accNo;

		String accHolderName;

		long contactNo;

		String typeOfAccount;

		float accBalance = 5000;

		Account account;
		while(value) {
		System.out.println("Welcome to the Bank Application");
		System.out.println("-------------------------------");
		System.out.println("1.Create an Account");
		System.out.println("2.Check Balance");
		System.out.println("3.Check Account details");
		System.out.println("4.Deposit");
		System.out.println("5.Withdraw");
		System.out.println("6.FundTransfer");
		System.out.println("7.PrintBank Statement");

		System.out.println();

		System.out.print("Please select an option:-");
		int option = scan.nextInt();
		System.out.println();
		
		switch (option) {
		case 1: {
			System.out.println("Please create your account");
			System.out.println("--------------------------");
			System.out.print("Please enter your name:-");
			accHolderName = scan.next();

			System.out.print("Please enter your contact number:-");
			contactNo = scan.nextLong();

			System.out.print("Please enter the type of account:-");
			typeOfAccount = scan.next();

			accNo = contactNo - 43545665;

			account = new Account(accNo, accHolderName, contactNo, typeOfAccount, accBalance);
		
			accounts.put(accNo,account);
			
			System.out.print("your account is created successfully with an account number :-"+accNo);
			System.out.println("\n \n \n");
			System.out.println();
			break;
		}
		case 2: {
			System.out.println("Check Balance");
			System.out.println("-------------");
			
			System.out.print("Enter your account number:-");
			accNo= scan.nextLong();
			
			account = accounts.get(accNo);
			
			float Balance = account.getAccBalance();
			
			System.out.println("Your account balance is :-"+Balance); 
			System.out.println("\n \n \n");
			break;
			
		}
		case 3: {
			System.out.println("Check your account details");
			System.out.println("--------------------------");
			
			System.out.print("Enter your account number:- ");
			accNo = scan.nextLong();
			
			System.out.println(accounts.get(accNo));
			System.out.println("\n \n \n");
			break;
		}
		case 4: {
			System.out.println("Deposit");
			System.out.println("-------");
			
			System.out.print("Please enter your account number :- ");
			accNo = scan.nextLong();
			
			System.out.print("Please enter your deposit amount :-");
			
			float depositAmount = scan.nextFloat();
			
			account = accounts.get(accNo);
			
			float existingBalance = account.getAccBalance();
			
			float finalAmount = existingBalance+ depositAmount;
			
			account.setAccBalance(finalAmount);
			
			System.out.println("Your amount is credited successfulyy.");
			System.out.println("The current balance is :- " +finalAmount);
			
			
			System.out.println("\n \n \n");
			break;
			
		}
		case 5: {
			System.out.println("withdraw");
			System.out.println("--------");
			
			System.out.print("Please enter your account number:- ");
			accNo = scan.nextLong();
			
			System.out.print("Enter your withdrawal amount:-");
			float withdrawalAmount = scan.nextFloat();
			
			account = accounts.get(accNo);
			
			float existingBalance = account.getAccBalance();
			
			float finalAmount = existingBalance - withdrawalAmount;
			
			System.out.println("Your amount is debited successfully");
			
			account.setAccBalance(finalAmount);
			
			System.out.println("your current balance is :- "+finalAmount);
			
			
			System.out.println("\n \n \n");
			break;
		}
		case 6: {
		}
		case 7: {
		}
		default: {
		}

		}
		}
	}

}
