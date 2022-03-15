package Array;

public class Array_06 {

	public static void reverse(int[] a) {
		int start = 0, end = a.length-1;
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		for(int i : arr)
			System.out.print(i + " ");
	}

}
