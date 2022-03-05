package string;

public class SwapStringWithThiredVariable {

	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hello";
		String s3=s1+s2;
		
		System.out.println(s3);
		//                       6        -    4   =      2
		String s4=s3.substring(s3.length()-s2.length());
		//                     0, 6-4=2
		String s5=s3.substring(0,s3.length()-s2.length());
		
		
		System.out.println(s4+s5);
	
		
		

	}

}
