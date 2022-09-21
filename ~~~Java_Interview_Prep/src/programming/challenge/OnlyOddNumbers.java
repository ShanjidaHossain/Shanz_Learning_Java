package programming.challenge;

import java.util.List;

public class OnlyOddNumbers {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
	

}
