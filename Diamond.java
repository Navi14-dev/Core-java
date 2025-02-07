package patterns;

public class Diamond {
	public static void main(String[] args) {
		//Diamond = pyramid + InvertedPyramid
		int n=5;
		//Pyramid
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Inverted pyramid
		
		for(int i=n-1;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
