package arrays;

class Students{
	String name;
	int age;
	Students(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
}
public class Student {
	public static void main(String[] args) {
		Students[] s=new Students[3];
		s[0]= new Students("Naveen", 36);
		s[1]= new Students("Chinnu", 9);
		s[2]= new Students("Ansar", 44);
		for(Students s1:s) {
			s1.display();
		}
	}
}
