package word;

import java.util.HashSet;

public class DuplicateWord {

	public static void main(String[] args) {
		
		String s="welcome to karnataka welcome to belagavi";
		String[] s1 = s.split(" ");
		
		HashSet<String> hs=new HashSet<String>();
		for(int i=0; i<s1.length ; i++) {
			hs.add(s1[i]);
		}
		for (String word : hs) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(word.equalsIgnoreCase(s1[i])) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(word);
			}
		}
	}

}
