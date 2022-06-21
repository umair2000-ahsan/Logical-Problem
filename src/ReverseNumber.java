import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number for reverse");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int rev=0;
		while (number!=0) {
			rev=rev*10+number%10;
			number=number/10;
			
		}
		
		
		System.out.println(rev);
	}

}
