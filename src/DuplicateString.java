
public class DuplicateString {
	public static void main(String[] args) {
		String str="myename";
		String str1=str.toLowerCase();
		char[] charArray=str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
					System.out.print(charArray[j]);
					
				}
			}
			
		}
		
		
		
	}

}
