package oops;

public class Car {
	String brand;
	int price;
	int speed;
	
	
	Car(String brand , int price , int speed){
		this.brand=brand;
		this.price=price;
		this.speed=speed;
	}
//	void gears() {
//		System.out.println("6 gears");
//		System.out.println("Brand  : " + brand + "\n" + "Price : " + price + "\n" + "Speed : " + speed);
//
//	}

	
	void displayCar() {
		System.out.println("Car Brand : "+brand);
		System.out.println("Car Price : "+price);
		System.out.println("Car Speed : "+speed);
	}
	public static void main(String[] args) {
//		Car c = new Car();
//		c.brand = "Audi";
//		c.price = 300000;
//		c.speed = 169;
//		c.gears();
//
//		
//		Car c1=new Car();
//		c1.brand="Suzuki";
//		c1.price = 200000;
//		c1.speed = 140;
		
		Car c=new Car("Audi" , 300000 ,168);
		Car c1=new Car("BMW" , 200000 ,169);
		c.displayCar();
		c1.displayCar();
		
	}
}
