/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Walter White");
		BankAccount c = new BankAccount("Jesse Pinkman", 230670.41);

		a.displayAccountInfo();
		b.displayAccountInfo();
		c.displayAccountInfo();
		System.out.println();

		System.out.println("----------ACCOUNT 1 ACTIONS----------");
		a.setOwner("Mike Ehrmantraut");
		a.deposit(50325.58);
		System.out.println("The new owner of account a is " + a.getOwner());
		System.out.println("The account balance of " + a.getOwner() + "'s account is " + a.getBalance());
		System.out.println();

		System.out.println("----------ACCOUNT 2 ACTIONS----------");
		System.out.println(b.getOwner() + " is trying to withdraw $50000");
		b.withdraw(50000);
		System.out.println();

		System.out.println("----------ACCOUNT 3 ACTIONS----------");
		System.out.println(c.getOwner() + " is trying to withdraw $" + c.getBalance());
		c.withdraw(c.getBalance());
		c.checkBalance();
		c.closeAccount();
		c.deposit(1);
		
	}
}
