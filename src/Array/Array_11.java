package Array;

import java.util.Arrays;

public class Array_11 {

	public static void union(int[] arr, int m, int[] brr, int n) {
		if(m > n) {
			int[] temp = arr;
			arr = brr;
			brr = temp;
		}
		Arrays.sort(arr);
		for(int i : arr)
			System.out.print(i + " ");
		for(int i = 0; i < n; i++) {
			if(Arrays.binarySearch(arr, brr[i]) < 0)
				System.out.print(brr[i] + " ");
		}
	}
	
	public static void intersection(int[] arr, int m, int[] brr, int n) {
		if(m > n) {
			int[] temp = arr;
			arr = brr;
			brr = temp;
		}
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			if(Arrays.binarySearch(arr, brr[i]) >= 0)
				System.out.print(brr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] brr = {3,4,5,6,7};
		int m = arr.length;
		int n = brr.length;
		System.out.print("Union : ");
		union(arr, m, brr, n);
		System.out.println();
		System.out.print("Intersection : ");
		intersection(arr, m, brr, n);
	}

}
