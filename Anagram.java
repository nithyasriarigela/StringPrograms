package nithya;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a="dusty";
		String c="";
		String b="study";
		String d="";
		
		for(int i=0;i<a.length();i++) {
			c=c+(char)(a.charAt(i)+32);
			c=c+(char)(a.charAt(i)-32);
			d=d+(char)(b.charAt(i)-32);
			d=d+(char)(b.charAt(i)+32);
		}
		
		char[] c1=c.toCharArray();
		char[] c2=d.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("It's Anagram");
		}
		else {
			System.out.println("It's not Anagram");
		}
		

	}

}
