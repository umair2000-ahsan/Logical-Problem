import java.util.Scanner;

public class FabonacciSeries {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter no to print Fabonacci series");
	 int n = scan.nextInt();
	 
	 
	int f=0;
	int s=1;
	System.out.println(f);
	System.out.println(s);
	for (int i = 0; i <=n; i++) {
		int t=f+s;
		f=s;
		s=t;
		System.out.println(t);	
	}
	
}
}
