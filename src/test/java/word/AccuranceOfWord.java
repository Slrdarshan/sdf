package word;

import java.util.HashSet;
import java.util.Iterator;

public class AccuranceOfWord {

	public static void main(String[] args) {
		
		String s1="welcome to karnataka welcome to belagavi";
		String[] s2=s1.split(" ");

		HashSet<String> hs=new HashSet<String>();
		for (int i = 0; i < s2.length; i++) {
			hs.add(s2[i]);
		}
		
		for (String word : hs) {
			int count=0;
			for (int i = 0; i < s2.length; i++) {
				if(word.equalsIgnoreCase(s2[i])) {
					count++;
				}
			}
			System.out.println(word+"  "+count);
		}
		
	}

}
