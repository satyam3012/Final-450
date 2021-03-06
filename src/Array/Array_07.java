package Array;

class Pair {
	int min, max;
}

public  class Array_07 {

	public static Pair getMinMax(int[] arr, int low, int high) {
		Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;
 
        // If there is only one element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
 
        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
 
        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);
 
        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }
 
        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }
 
        return minmax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		Pair p = getMinMax(arr, 0, n-1);
		System.out.println("Min : " + p.min + " Max : " + p.max);
	}

}
