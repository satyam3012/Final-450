package Array;

public class MergeSort {
	
	public static void merge(int[] arr, int l, int m, int h) {
		int n1 = m - l + 1;
		int n2 = h - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i = 0; i < n1; i++) 
			left[i] = arr[l + i];
		
		for(int i = 0; i < n2; i++)
			right[i] = arr[m + i + 1];
		
		int i = 0, j = 0, k = l;
		
		while(i < n1 && j < n2) {
			if(left[i] <= right[j])
				arr[k++] = left[i++];
			
			else
				arr[k++] = right[j++];
		}
		
		while(i < n1) {
			arr[k++] = left[i++];
		}
		
		while(j < n2) {
			arr[k++] = right[j++];
		}
	}
	
	public static void mergerSort(int[] arr, int l, int h) {
		if(l < h) {
			int m = l + (h - l)/2;
			
			mergerSort(arr, l, m);
			mergerSort(arr, m + 1, h);
			
			merge(arr, l, m, h);
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i : arr)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4, 2, 9, 5, 6};
	
		System.out.print("Before merger sort : ");
		printArray(arr, arr.length);
		
		System.out.println();
		
		System.out.print("After merge sort : ");
		mergerSort(arr, 0, arr.length - 1);
		printArray(arr, arr.length);
	}

}
