package demoJavaproject;

import java.util.Scanner;

public class Dog {
	public static void main(String[] args) {
		
		//----------------- Data types -------------------------
//		byte a=127; //Range -127 to 127
//		short b=128; //Range 
//		int c=100;
//		long d=100;
//		float e=100.0f;
//		double f=2.555554d;
//		char name='c';
//		String na="navi";
//		boolean g=true;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(name);
//		System.out.println(na);
//		System.out.println(g);
		
		
		
		//--------------Take input from the user ------------------
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a value : ");
//		int a= sc.nextInt();
//		System.out.println("Enter b value : ");
//		float b=sc.nextFloat();
//		System.out.println("Enter bool value : ");
//		boolean bool=sc.nextBoolean();
//		System.out.println("Enter name : ");
//		String name=sc.next();
//		System.out.println("Enter name1 value : ");
//		String name1=sc.nextLine();
//		System.out.println("a : "+a+"\n" + "b : "+b+"\n"+"bool : "+bool+"\n"+"name : "+name+"\n"+" name1 : "+name1);
//		sc.close();
		
		
//		----------------Arithmetic Operation------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a= sc.nextInt();
		System.out.println("Enter b value : ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Addition is : "+sum);
//		System.out.println("Addition is : "+(a+b));
		System.out.println("Enter c value : ");
		int c=sc.nextInt();
		float sub=sum-c;
		System.out.println("substraction is :"+sub);
		System.out.println("Enter d value : ");
		double d=sc.nextDouble();
		double mul=sub*d;
		System.out.println("Multiplication is : "+mul);
		System.out.println("Enter e value : ");
		int e=sc.nextInt();
		int div=(int) (mul/e);
		System.out.println("Division is : "+div);
		int mod=a%b;
		System.out.println("Modulus is : "+mod);
		
		
		
		
		
		
		
		sc.close();
		
	}
}
