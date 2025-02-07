package arrays;

public class Array1D {
	public static void main(String[] args) {
		int []numbers= {1,2,3,4,5,6,7,8,9};  //Index values starts from 0
		System.out.println("The third position element is : "+numbers[2]);
		for(int number:numbers) {
			System.out.println(number);
		}
	}
}
