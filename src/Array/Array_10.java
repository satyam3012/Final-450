package Array;

public class Array_10 {

	public static void reArrange(int[] arr) {
		int j = 0; //this will increment till we get positive no and when we get any neg no then we will swap i and j
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-4,-5,7};
		reArrange(arr);
		for(int i : arr)
			System.out.print(i + " ");
	}

}
