package programming.challenge;

import java.util.Scanner;

public class QuadEquation {

	double a = 0;
	double b = 0;
	double c = 0;

	public void calculateRoots(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
		double d = (b * b) - (4 * a * c);
		if (d > 0.0) {
			double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (d == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("Roots are not real.");
		}

	}

	public static void main(String[] args) {

		QuadEquation equ = new QuadEquation();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = sc.nextDouble();

		equ.calculateRoots(a, b, c);

		sc.close();

	}

}
