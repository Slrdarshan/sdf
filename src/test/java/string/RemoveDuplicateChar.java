package string;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s1="sudarshan";
		
		TreeSet<Character> hs=new TreeSet<Character>();
		for (int i = 0; i < s1.length() ; i++) {
			hs.add(s1.charAt(i));
		}
		
		for (Character ch : hs) {
			System.out.print(ch);
		}
	}

}
