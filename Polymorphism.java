package oops;



class vehicle{
	//Method with single parameter
	void speed(int max_speed) {
		System.out.println("Vehicle speed : "+max_speed+" kmph");
	}
	//Overloaded method with 2 parameters
	void speed(int max_speed , String unit) {
		System.out.println("Vehicle speed is : "+max_speed+" "+unit);
	}
}
public class Polymorphism {
//	runtime --> Overloading
//	compile time --> Overriding
	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.speed(152);
		v.speed(125, "kmph");
	}
}
