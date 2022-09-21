package practice;

import java.util.Scanner;

public class Read_till_end_of_line {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        int c=1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(c+ " " +s);
            c++;
        }

	}

}
