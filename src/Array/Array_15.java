package Array;
import java.util.*;

public class Array_15 {

	public static int minJumps(int[] arr) {
		int start = 0, end = arr.length-1;
		HashMap<Integer, Integer> map = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		map.put(start, 0);
		while(!q.isEmpty()) {
			int index = q.poll();
			int val = arr[index];
			int prev = map.get(index);
			//terminating condition
			if(index == end)
				return map.get(index);
			for(int i = 1; i <= val; i++) {
				if(!map.containsKey(i+index)) {
					q.add(i+index);
					map.put(i+index, prev+1);
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,2,1,0,0,1,3};
		System.out.println("Min jumps : " + minJumps(arr));
	}

}
