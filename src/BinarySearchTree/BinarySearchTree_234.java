package BinarySearchTree;
import java.util.*;

public class BinarySearchTree_234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int max = Integer.MIN_VALUE, secondMax = 0;
		
		for(int i : list) {
			if(i > max) {
				max = i;
			}
			
			if(secondMax != max) {
				secondMax = Math.max(secondMax, max);
			}
		}
		
		System.out.println("secondmax " + secondMax);

	}

}
