import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to cheack Palindrome");
	int n = scan.nextInt();
	
	int sum=0,r;
	int x=n;
	while (n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		
		
	}
	if (sum==x) {
		System.out.println("Number is palindrome");
	
		
	}
	else {
		System.out.println("No is not Palindrome");
	}
	
}
}
