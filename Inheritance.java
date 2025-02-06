package oops;

class Animal {
	void makeSound() {
		System.out.println("Animal makes sounds");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dogs Bark");
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		d.bark();
	}
}

