package control_statements;

import java.util.Scanner;

public class LoopsAndOperators {
	public static void main(String[] args) {
	/*	Operators types : 
	 
			1.Arithmetic Operators (+,-,*,/,%)
			
			2.Shift Operators (>> , << , >>> )
			
			3.Unary Operators (exp++ , exp-- , ++exp , --exp , +exp , -exp , ~ , !)
			
			4.Relational Operators (> , < ,>= , <= , instanceOf , == , != )
			
			5.Bitwise Operators (& , ^ , | )
			    &  --> Bitwise AND operator
			    |  --> Bitwise OR operator
			    ^  --> Bitwise XOR operator
			    ~  --> Bitwise Complement operator
			    >>  --> Bitwise Right Shift
			    <<  --> Bitwise Left Shift
			    
			     
			
			6.Logical Operators (&& , || )    - used when only boolean values are there
			    &&  --> Logical AND
			    ||  --> Logical OR
			    !  --> Logical NOT
			
			7.Ternary Operators (? , :)
			
			8.Assignment Operators (== , += , -= , *= , /= , %= , &= , ^= , != , <<= , >>= , >>>=)
			 
	*/
		
		
		
//		Controllers (Control statements)-->   if , if else , if else if , nested if , switch
		
//		Looping Statements --> do while , for loop , while loop
		
		Scanner sc=new Scanner(System.in);
	/*	----------If ----------
	    System.out.println("Enter your age : ");
		int age=sc.nextInt();
		if(age > 18 && age < 120) {
			System.out.println("Eligible for Pancard");
		}
		else {
			System.out.println("Not Eligible");
		}
		
	*/
		 /*------- if-else-if ------------ 
		  
		System.out.println("Enter your marks : ");
		int marks=sc.nextInt();
		if(marks>=90 && marks <=100) {
			System.out.println("A Grade");
		}
		else if(marks>=80 && marks <90) {
			System.out.println("B Grade");
		}
		else if(marks>=60 && marks <80) {
			System.out.println("C Grade");
		}
		else if(marks>=40 && marks <60) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}
		
		
		*/
		
		
		/* ------------ nested if ----------------
		
		System.out.println("Enter Weight : ");
		double weight = sc.nextDouble();
		System.out.println("Enter Height : ");
		double height = sc.nextDouble();
		if(weight>=50 && weight <=70) {
			if(height >= 5.1 && height <=6.0) {
				System.out.println("Eligible");
			}
			else {
				System.out.println("Not eligible");
			}
		}
		else {
			System.out.println("Invalid data");
		}
		
		
		*/
		
		
		/* ----------- switch --------------- 
		System.out.println("Enter a key : ");
		int key=sc.nextInt();
		switch(key) {
		case 1:
			System.out.println("Q");
			break;
		case 2:
			System.out.println("W");
			break;
		case 3:
			System.out.println("E");
			break;
		case 4:
			System.out.println("R");
			break;
		case 5:
			System.out.println("T");
			break;
		case 6:
			System.out.println("Y");
			break;
		case 7:
			System.out.println("U");
			break;
		case 8:
			System.out.println("I");
			break;
		case 9:
			System.out.println("O");
			break;
		case 10:
			System.out.println("P");
			break;
		case 11:
			System.out.println("A");
			break;
		case 12:
			System.out.println("S");
			break;
		case 13:
			System.out.println("D");
			break;
		case 14:
			System.out.println("F");
			break;
		case 15:
			System.out.println("G");
			break;
		case 16:
			System.out.println("H");
			break;
		case 17:
			System.out.println("J");
			break;
		case 18:
			System.out.println("K");
			break;
		case 19:
			System.out.println("L");
			break;
		case 20:
			System.out.println("Z");
			break;
		case 21:
			System.out.println("X");
			break;
		case 22:
			System.out.println("C");
			break;
		case 23:
			System.out.println("V");
			break;
		case 24:
			System.out.println("B");
			break;
		case 25:
			System.out.println("N");
			break;
		case 26:
			System.out.println("M");
			break;
		default :
			System.out.println("-----Invalid Option------");
			break;
			
		}
		
	*/
		
		
		
	/* ----------- For Loop ------------ */
//		for loop --> if we know the no.of iterations then , it will use 
	/*	Syntax : 
			for(initialization ; condition ; increment/decrement) {
			print statements 
		}
	*/
		
//		while loop --> if we do not know how much data in the database (no. of iterations are not known)
		
	/*	Syntax :
			initialization;
		 	while(condition) {
		 		print statements ;
		 		increment/decrement
		 	}
		 	
	*/
		
		
	/*	do while --> to print atleast one time if the given condition is false
		Syntax :
			initialize;
		    do {
		    	statements;
		    	increment/decrement;
		    }
		    while(condition);
		    
	*/
		
//		for(int i=0;i<10;i++) {
//			System.out.println((i+1)+" : Navi");
//		}
		
		
//		int i=0;
//		System.out.println("Enter number of times to print : ");
//		int n=sc.nextInt();
//		while(i<n ) {
//			System.out.println("Navi");
//			i++;
//		}
		
//		
//		int i=0;
//		do {
//			System.out.println("Chinnu");
//			i++;
//		} while(i<10);
//		
//		
//		
//		
//		sc.close();
		
//		System.out.println("Enetr a vlaue : ");
//		int a =sc.nextInt();
//		System.out.println("Enetr b vlaue : ");
//		int b =sc.nextInt();
		/*------------------Assignment Operators------------------
		System.out.println("Enetr a vlaue : ");
		int a =sc.nextInt();
		System.out.println("Enetr b vlaue : ");
		int b =sc.nextInt();
		a+=b; // a=a+b;
		System.out.println(a);
		a-=b; // a=a-b;
		System.out.println(a);
		a*=b; // a=a*b;
		System.out.println(a);
		a/=b; // a=a/b;
		System.out.println(a);
		a%=b; // a=a%b;
		System.out.println(a);
		a|=b; // a=a|b;  or gate
		System.out.println(a);
		a&=b; // a=a&b;  and gate
		System.out.println(a);
		a^=b; // a=a^b;  xor
		System.out.println(a);
		a<<=b; // a=a<<b;  left shift
		System.out.println(a);
		a>>=b; // a=a>>b;  right shift
		System.out.println(a);  */
		
		
		/* ----------------- Relational Operators ----------------
		
		System.out.println((a==b));
		System.out.println((a!=b));
		System.out.println((a>b));
		System.out.println((a<b));
		System.out.println((a<=b));
		System.out.println((a>=b));
		
		*/
		
		
		/*-------------- Logical Operators ---------------
		
		boolean x=true , y=false;
		System.out.println((x&&y)); // Logical AND
		System.out.println((x||y));  // Logical OR
		System.out.println((!x));
		
		*/
		
		
		/*----------------- Bitwise Operators -------------*/
		
		int a=5,b=3;
		System.out.println((a&b));
		System.out.println((a|b));
		System.out.println((a^b));
		System.out.println((~a));
		System.out.println((a<<1));
		System.out.println((a>>1));
	}
}
