package oops;


class Phone {
	String brand;
	Phone(String brand){
		this.brand=brand;
	}
	void makeCall(String number) {
		System.out.println(brand+" is calling from this "+number);
	}
	
	void sms(String number , String message) {
		System.out.println("Sending message to "+number +" : "+message);
	}
}

class SmartPhone extends Phone{

	boolean beingTouched;
	SmartPhone(String brand , boolean beingTouched) {
		super(brand);
		this.beingTouched=beingTouched;
	}
	
	void browseInternet() {
		System.out.println(brand+" is browsing in the internet");
	}
	
}
public class InhertanceExample1 {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone("Samsung", true);
		s.makeCall("8074091052");
		s.sms("5565241424", "Hello");
		s.browseInternet();
	}
}
