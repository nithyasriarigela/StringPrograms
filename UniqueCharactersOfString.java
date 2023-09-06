package nithya;
import java.util.*;
public class UniqueCharactersOfString {
        public static boolean areCharactersUnique(String str) {
        	
		int n = str.length();
		
		for (int i = 0; i < n; i++)
		for (int j = i + 1; j < n; j++)
			if (str.charAt(i) == str.charAt(j))
			return false;
		return true;
	}

	public static void main(String[] args) {
		String s = "nithya";
		if (areCharactersUnique(s))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
	
	}




