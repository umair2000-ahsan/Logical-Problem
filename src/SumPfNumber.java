import java.util.Scanner;

public class SumPfNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int sum=0;
		int rem=0;
		while (n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			
			
		}
		System.out.println("Sum is the :" +sum);
	}

}
