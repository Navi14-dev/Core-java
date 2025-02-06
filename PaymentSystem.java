package oops;

import java.util.Scanner;

interface Payment{
	void pay(double amount);
}
class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Amount paid :"+amount+" using credit card");
	}
}

class PhonepePayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Amount paid :"+amount+" using phonepe");
	}
}

class gpayPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Amount paid :"+amount+" using gpay");
	}
}
public class PaymentSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to pay");
		double amount=sc.nextDouble();
		int userValue;
		do {
			displayMenu();
			System.out.println("Enter the userValue : ");
			userValue = Integer.parseInt(sc.next());
			Payment paymentmethod = null;
			switch(userValue) {
			case 1:
				paymentmethod=new CreditCardPayment();
				break;
			case 2:
				paymentmethod=new PhonepePayment();
				break;
			case 3:
				paymentmethod=new gpayPayment();
				break;
			default:
				System.out.println("invalid Option");
				break;
			}
			paymentmethod.pay(amount);
		} 
		while(userValue>0);
	}

	private static void displayMenu() {
		System.out.println("Select a payment method : ");
		System.out.println("1.Creditcard Payment");
		System.out.println("2.Phonepe Payment");
		System.out.println("3.Gpay Payment");
		
	}
}
