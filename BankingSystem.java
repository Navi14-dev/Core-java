package oops;

class BankAccount{
	double balance;
	BankAccount(double balance) {
		this.balance=balance;
	}
	void calInterest() {
		
		
	}
	void calculateInterest() {
		System.out.println("Interest rate calculated");
	}
}
class CurrentAccount extends BankAccount{
	CurrentAccount(double balance) {
		super(balance);
	}
	@Override
	void calculateInterest() {
		double interest=balance*0.04;
		System.out.println("Interest is :  "+interest);
	
	}
}

class savingsAccount extends BankAccount{
	savingsAccount(double balance){
		super(balance);
	}
	@Override
	void calInterest() {
		
		double interest= balance*0.2;
		System.out.println("Savings Account interest is : "+interest);
	}
}
public class BankingSystem {
	public static void main(String[] args) {
		BankAccount b=new CurrentAccount(24000.00);
		BankAccount  ba=new savingsAccount(23000.00);
		b.calculateInterest();
		ba.calInterest();
	}
}
