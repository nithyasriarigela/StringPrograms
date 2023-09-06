package nithya;

public class Pangram {

	public static void main(String[] args) {
		boolean b=false;
		
		String s="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		s=s.replace(" ","");
		
		char[] c=s.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<c.length;i++) {
			int index=c[i]-65;
			ar[index]++;
		}
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.println("It's not pangram");
				b=true;
			}
		}
			if(b==false) {
				System.out.println("It's pangram");
			}
		

	}

}
