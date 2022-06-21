import java.util.HashMap;
import java.util.Map;

public class OccurencOfString {
	public static void main(String[] args) {
		String str="JavaProgramer";
		Map<Character,Integer> duphs=new HashMap<>();
		char[] arr=str.toCharArray();
		for (char keys : arr) {
			if (duphs.containsKey(keys)) {
				duphs.put(keys, duphs.get(keys)+1);
			}
			else {
				duphs.put(keys,1);
			}
			
			
		}
		System.out.println(duphs);
	}
}
