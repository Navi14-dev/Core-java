package oops;

class Employee{
	private int id;
	private String name;
	private String email;
	private double salary;
	//All arguments Constructor
	public Employee(int id,String name,String email,double salary){
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
		
	}
	//Getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	
	//Setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	//No arguments Constructor
	public Employee() {
		super();	
	}
	
	public void updateSalary(double newSalary) {
		if(newSalary>0) {
			this.salary=newSalary;
			System.out.println("Updated Salary is :"+newSalary);
		}
		else {
			System.out.println("Invalid Salary");
		}
	}
}

class HRDepartment{
	public void increaseSalary(Employee e,double newSalary) {
		e.updateSalary(newSalary);
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee e =new Employee(1,"Naveen","navi@gamil.com",20000.00);
		System.out.println("Employee Id :"+e.getId());
		System.out.println("Employee Name :"+e.getName());
		System.out.println("Employee Email :"+e.getEmail());
		System.out.println("Employee Salary :"+e.getSalary());
		
		HRDepartment hr=new HRDepartment();
		hr.increaseSalary(e, 50000.00);
		System.out.println("Updated Salry is :"+e.getSalary());
	}
}
