package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AcceranceOfEachChar {

	public static void main(String[] args) {
		
		String s1="sudarshan";
		
		HashSet<Character> hs=new HashSet<Character>()	;
				for (int i = 0; i < s1.length() ; i++) {
					
					hs.add(s1.charAt(i));
					
				}
				
				for (Character ch : hs) {
					int count=0;
					for (int i = 0; i < s1.length() ; i++) {
						if(ch==s1.charAt(i)) {
						    count++;	
					}	
				}
					System.out.println(ch+"  "+count);
				}
				
	}

}
