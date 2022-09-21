package programming.challenge;

public class Pyramid {
	public static void printStarsLeft(int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printTriangleMiddle(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printStarsRight(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printStarUpsideDown(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void reverseTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Printing the reverse pattern
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[]) {
		int n = 5;
		printStarsRight(n);
		System.out.println();
		printStarsLeft(n);
		System.out.println();
		printTriangleMiddle(n);
		System.out.println();
		printStarUpsideDown(n);
		System.out.println();
		reverseTriangle(n);
	}
}
