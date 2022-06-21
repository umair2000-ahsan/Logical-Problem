
public class Armstrong {
	public static void main(String[] args) {
		int n=370;
		int sum=0,r;
		int x=n;
		while (n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if (sum==x) {
			System.out.println("No is Armstrong");
			
		}
		else {
			System.out.println("no is not Armstromnn");
		}
	}

}
