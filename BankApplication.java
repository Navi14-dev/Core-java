package oops;

import java.util.Scanner;

//Abstract class
abstract class BankStatement{
	protected String accountHolder;
	protected double balance;
	//Constructor
	public BankStatement(String accountHolder , double balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	//Calculation of Interest method
	abstract void calculationOfInterest();
	//method for Deposit
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("The Deposited Amount is : "+amount+ " New Updated balance is :"+balance);
	}
	
	//Method for withdrawal
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Fund in the Account");
		}
		else {
			balance-=amount;
			System.out.println("The withdraw amount is "+amount+" New updated balace is "+balance);
		}
	}
	
	
	//method for Displaying the details of the account like accountholder name & the balance
	public void displayBalance() {
		System.out.println("AccountHolder name is :"+accountHolder);
		System.out.println("Present Balance in the Account is :"+balance);
	}
}


class SavingsAccount extends BankStatement{
	private double interestRate=5.0;//5% of interest
	public SavingsAccount(String accountHolder , double balance) {
		super(accountHolder, balance);
	}
	@Override
	void calculationOfInterest() {
		double interest=(balance*interestRate)/100;
		balance+=interest;
		System.out.println("Interest added : "+interest+ " Present balance is :"+balance);
	}	
}

class currentAccount extends BankStatement{
	private double interestRate=2.0;//5% of interest
	public currentAccount(String accountHolder , double balance) {
		super(accountHolder, balance);
	}
	@Override
	void calculationOfInterest() {
		double interest=(balance*interestRate)/100;
		balance+=interest;
		System.out.println("Interest added : "+interest+ " Present balance is :"+balance);
	}	
}




public class BankApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankStatement b=new SavingsAccount("Naveen",23000.00);
		b.displayBalance();
		b.calculationOfInterest();
		b.deposit(2000.00);
		b.withdraw(3000.00);
		
		
		sc.close();
	}
}
