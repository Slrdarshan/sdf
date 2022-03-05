package string;

public class SwapStringWithoutThiredVariable {

	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hello";
		System.out.println(s1+s2);
		
		String temp=s1;
		 s1=s2;
        s2=temp;
        
        System.out.println(s1+s2);

	}

}
