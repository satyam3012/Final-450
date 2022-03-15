package String;

import java.util.Arrays;

public class String_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "XY", s2 = "12", s = "1X2Y";
		if(checkLength(s1, s2, s) && shuffleCheck(s1, s2, s))
			System.out.println("valid shuffle");
		else
			System.out.println("invalid shuffle");
	}
	
	public static boolean checkLength(String first, String second, String result) {
		if(first.length() + second.length() != result.length()) 
			return false;
		return true;
	}
	
	public static String sortString(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		str = String.valueOf(ch);
		return str;
	}
	
	public static boolean shuffleCheck(String first, String second, String result) {
		first = sortString(first);
		second = sortString(second);
		result = sortString(result);
		
		int i = 0, j = 0, k = 0;
		while(k != result.length()) {
			if(i < first.length() && first.charAt(i) == result.charAt(k))
				i++;
			else if(j < second.length() && second.charAt(j) == result.charAt(k))
				j++;
			else 
				return false;
			k++;
		}
		
		if(i < first.length() || j < second.length())
			return false;
		return true;
	}

}
