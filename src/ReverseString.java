
public class ReverseString {
 public static void main(String[] args) {
//	System.out.println("Enter a String for Reverse");
//	Scanner scan=new Scanner(System.in);
//	String str=scan.next();
	String str1="My Name is Umair";
	String str=str1.replaceAll("\\s", "");
	String rev="";
	for (int i =str.length()-1; i>=0 ; i--) {
		rev=rev+str.charAt(i);
		
	}
	System.out.println("The revrse String is: "   +rev);
}
}
