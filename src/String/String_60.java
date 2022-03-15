package String;
import java.util.*;

public class String_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD", s2 = "CDBA";
		if(areRotations1(s1, s2)) {
			System.out.println("Yes, they are rotation of each other");
		}
		else
			System.out.println("No");
	}
	
	public static boolean areRotations1(String s1, String s2) {
		return (s1.length() == s2.length() && (s1+s2).indexOf(s2) != -1);
	}
	
	public static boolean areRotations2(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		for(int i = 0; i < s1.length(); i++) {
			q1.add(s1.charAt(i));
		}
		
		for(int i = 0; i < s2.length(); i++) {
			q2.add(s2.charAt(i));
		}
		
		int k = s2.length();
		while(k-- != 0) {
			char ch = q2.remove();
			q2.add(ch);
			if(q2.equals(q1)) 
				return true;
		}
		return false;
	}

}
