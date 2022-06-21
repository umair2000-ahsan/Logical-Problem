import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		int n=scan.nextInt();
		int x,s=0,r;
		x=n;
		while (n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
			
			
		} 
		if (s==x) {
			System.out.println("Numbers is Palindrome");
			
		}
		else {
			System.out.println("Number is not Pliddrome");
		}
	}

}
