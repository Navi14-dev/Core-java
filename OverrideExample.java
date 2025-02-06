package oops;


class Animals{
	void makeSound() {
		System.out.println("Animals make sounds");
	}
}

class Cat extends Animals{
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
public class OverrideExample {
	public static void main(String[] args) {
		Animals a=new Animals();
		a.makeSound();
		Animals a1=new Cat();
		a1.makeSound();
	}
}
