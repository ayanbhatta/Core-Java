package com.jspider.practicequerstion;
//1.Create a class BankAccount where the account balance cannot be accessed directly. 
//Add methods to deposit and withdraw money with the following validations:
//Deposit amount must be positive and less than or equal to ₹1,00,000 at a time.
//Withdrawal amount must be positive and cannot exceed the current balance.
public class Mainclass1 {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(5000);
        myAccount.deposit(50000); 
        myAccount.deposit(150000); 
        myAccount.withdraw(10000);
        myAccount.withdraw(60000);

        System.out.println("Final Balance: ₹" + myAccount.getBalance());
        
        // myAccount.balance = 10; // This would cause a COMPILE ERROR (Direct access blocked)
    }

	

}
