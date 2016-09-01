package test;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) 
	{
		Account account1 = new Account("John Doe", 200.00);
		Account account2 = new Account("Jane Doe", 100.00);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		
		System.out.print("Enter deposit amount for accoun2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount); // add to account1's balance
		
		// display balances 
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n" ,
				account2.getName(), account2.getBalance());		
	}

}