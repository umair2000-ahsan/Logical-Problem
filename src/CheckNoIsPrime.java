import java.util.Scanner;

public class CheckNoIsPrime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a number to cheaack for  prime or not");
		int n=scan.nextInt();
		int flag=0;
	
		
		for (int i = 2; i < n/2;i++) {
			if (n%i==0) {
				
				flag=1;
				break;
			}
			
		}
		if (flag==0) {
			System.out.println("No is prime");
			
		}
	
		else  {
			System.out.println("No is prime no ");
			
		}
		
		
			
			
		
	}

}
