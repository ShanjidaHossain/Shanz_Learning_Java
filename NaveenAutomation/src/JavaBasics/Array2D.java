package JavaBasics;

import java.util.Iterator;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 Dimensional Array - Matrix  -- Rows, Column (0,0)
		
		String  x[][] = new String[3][5];
		System.out.println(x.length); // Total number of Rows
		System.out.println(x[0].length); // Total number of Columns
		
		//To initialize the row and column value
		
		//1st Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";

		//2nd Row 
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3rd Row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[1][2]);
		
		//To print all value of the 2D array 
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[0].length; column++) {
			System.out.println(x[row][column]);
		}
			
		}
	}

}
