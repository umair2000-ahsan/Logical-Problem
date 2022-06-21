import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		int j=0;
		for (int i = 1; i < num/2; i++) {
			if (num%i==0) {
				 j++;
				
			}
		}
		if (j==2) {
			System.out.println("No is prime no");
			
		}
		else {
			System.out.println("No is not prime no");
		}
	}

}
