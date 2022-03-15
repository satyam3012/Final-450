package Array;

public class QuickSort {
	
	public static void print(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	public static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int i = l;
		int j = h;
		
		while(i < j) {
			System.out.print("i - " + i + " , j - " + j + " , ");
			print(arr);
			System.out.println();
			while(i < arr.length-1 && arr[i] <= pivot)
				i++;
			
			while(j > 0 && arr[j] > pivot)
				j--;
			
			if(i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		
		int t = arr[j];
		arr[j] = arr[l];
		arr[l] = t;
		
		return j;
	}
	
	public static void quickSort(int[] arr, int l, int h) {
		if(l < h) {
			int pivot = partition(arr, l, h);
			System.out.println("pivot - " + arr[pivot]);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, h);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3,5,9,1,6};
		System.out.println("Before sorting : ");
		print(arr);
		
		System.out.println();
		
		System.out.println("After sorting");
		quickSort(arr, 0, arr.length-1);
		print(arr);

	}

}
