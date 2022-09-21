
public class EnumTutorials {
	
	public static void main(String[] args) {
		
		DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.FRIDAY;
		
		if(daysOfTheWeek == DaysOfTheWeek.FRIDAY) {
			System.out.println("Week is over !");
		}
		
		for (DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
			System.out.println(myDay);
		};
	}

}
