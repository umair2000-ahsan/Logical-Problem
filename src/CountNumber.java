import java.util.Scanner;

public class CountNumber {
public static void main(String[] args) {
	System.out.println("Eneter number to count the digit");
	Scanner scan =new Scanner(System.in);
	int n = scan.nextInt();
	int count=0;
	while (n!=0) {
		n=n/10;
		count++;
		
	}
	
	
	System.out.println(count);
}
}
