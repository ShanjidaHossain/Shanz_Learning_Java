package learning.control.structure;

public class While_Some_of_all_digit_in_number {

	public static void main(String[] args) {
		int inputNumber = 31; // Supply different inputs here
		int sumOfDigits = 0;
		int temp = 0;

		while (inputNumber > 0) {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		}

		System.out.println("Sum of digits are : " + sumOfDigits);
	}

}
