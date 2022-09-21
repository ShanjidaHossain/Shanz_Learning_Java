package JavaBasics;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		System.out.println("______________Duplicate Arrays String______________");

		String[] names = { "Shanjida", "Hossain", "Sazzad", "Hossain", "Mohammad", "Hossain" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}

		System.out.println("______________Duplicate Arrays String______________");

		int[] n = { 10, 10, 15, 63, 90, 80, 200, 200, 600 };

		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == (n[j])) {
					System.out.println(n[i]);
				}
			}
		}
	}

}
