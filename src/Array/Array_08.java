package Array;

import java.util.*;
public class Array_08 {

	public static int kMin(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < 5; i++)
			pq.add(arr[i]);
		while(k-- > 1)
			pq.poll();
		return pq.peek();
	}
	
	public static int kMax(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < 5; i++)
			pq.add(arr[i]);
		while(k-- > 1)
			pq.poll();
		return pq.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int k = 2;
		int max = kMax(arr, k);
		int min = kMin(arr, k);
		System.out.println("kth max : " + max + " kth min : " + min);
	}

}
