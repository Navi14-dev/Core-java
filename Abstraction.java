package oops;


abstract class Vehicle{
	abstract void start();
	public void stop() {
		System.out.println("Vehicle Stopped");
	}
}

class Car1 extends Vehicle{
	@Override
	void start() {
		System.out.println("Car has been started");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Vehicle v=new Car1();
		v.start();
		v.stop();
	}
}
