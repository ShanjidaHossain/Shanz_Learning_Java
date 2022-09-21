package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BozoSort {
	public static void main(String[] args) {

		Random rand = new Random();
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			numberList.add(rand.nextInt(10));
		}

		Random random = new Random();
		while (!isListSorted(numberList)) {
			int index1 = random.nextInt(numberList.size());
			int index2 = random.nextInt(numberList.size());

			int temp = numberList.get(index1);
			numberList.set(index1, numberList.get(index2));
			numberList.set(index2, temp);

		}

		numberList.forEach(i -> System.out.println(i));
	}

	private static boolean isListSorted(List<Integer> numberList) {
		if (numberList == null) {
			return true;
		}

		int length = numberList.size();
		if (length <= 1) {
			return true;
		}

		for (int i = 0; i < length - 1; i++) {
			if (numberList.get(i) > numberList.get(i + 1)) {
				return false;
			}
		}

		return true;
	}
}
