package programming.challenge;

public class Array_Seccond_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(findSecondHighest(array));

	}
	
	public static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}


}
