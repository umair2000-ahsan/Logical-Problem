import java.util.Scanner;

public class PlaindromeString {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("Enter String to cheack String is Palindrome or not ");
//		String str=scan.next();
		String str="aba";
		String rev="";
		String dup=str;
		for (int i = str.length()-1; i >=0; i--) {
			rev =rev+str.charAt(i);
			
		}
		
		
		if (rev.equals(dup)) {
			System.out.println("String is Palindrome");
			
		}
		else {
			System.out.println("String is not Plindrome");
		}		
	}

}
