package nithya;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="2552";
		
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
			
			if(a.equals(b)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
		
	}

}
