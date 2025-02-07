package patterns;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int n=5;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of lines : ");
//		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
