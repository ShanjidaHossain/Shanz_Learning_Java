package array.java;

public class Max_Min_in_Array {

	static class Pair {
		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		int i;

		/* If there is only one element then return it as min and max both */
		if (n == 1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}

		/* If there are more than one elements, then initialize min and max */
		if (arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		for (i = 2; i < n; i++) {
			if (arr[i] > minmax.max) {
				minmax.max = arr[i];
			} else if (arr[i] < minmax.min) {
				minmax.min = arr[i];
			}
		}

		return minmax;
	}

}
