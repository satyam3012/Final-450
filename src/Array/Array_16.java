package Array;

public class Array_16 {

	public static int findDuplicate(int[] a) {
		for(int i = 0; i <a.length; i++) {
            int j = Math.abs(a[i]) - 1;
            if(a[j] > 0) 
                a[j] = -a[j];
            else
                return j+1;
        }
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4};
		System.out.println("duplicate element : " + findDuplicate(arr));
	}

}
