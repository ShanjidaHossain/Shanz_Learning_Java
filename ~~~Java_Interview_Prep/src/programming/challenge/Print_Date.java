package programming.challenge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print_Date {

	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		String pattern2 = "yyyy-dd-MM";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);

		String date = simpleDateFormat.format(new Date());
		String date2 = simpleDateFormat2.format(new Date());

		System.out.println(date + "\n" + date2); // 06-23-2020

	}

}
