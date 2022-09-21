package queue.java;
import java.util.*;


class GfG {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			System.out.println(new Sol().countRev(s));
		}

	}
}
