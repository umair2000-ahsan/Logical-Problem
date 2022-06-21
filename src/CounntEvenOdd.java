import java.util.Scanner;

public class CounntEvenOdd {
public static void main(String[] args) {
	System.out.println("Enter noumber to count even and odd number");
	Scanner scan =new Scanner (System.in);
	int n = scan.nextInt();
	int count1=0;
	int count2=0;
	int rem=0;
	while(n>0) {
		rem=n%10;
		
		
		if (rem%2==0) {
			count1 ++;
			
		}
		else {
			count2 ++;
		}
	 n=n/10;
	}	
	System.out.println("The Even Number is" +count1);
	System.out.println("The total odd number is " +count2);
	
	}
}
