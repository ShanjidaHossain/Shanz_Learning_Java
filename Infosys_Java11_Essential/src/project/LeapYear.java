package project;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1900;
		boolean leap = false;
		if(year % 4 == 0 ) {
			if ((year % 100 == 0) && (year % 400 == 0)) {
				leap  = true;
			}else if(year % 100 !=0) {
				leap  = true;
			}
			else 
				leap  = false;
			
			if(leap) {
				System.out.println(year + " is leap year");
			}else {
				System.out.println(year + " not a leap year");
			}
		
			
		}

	}

}
