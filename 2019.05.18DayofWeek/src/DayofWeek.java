
import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Write down a day of week or 'q' for a quit.");
		
		String str = s.nextLine();
		while (true){
			if(str.equals("q")) break;			 
			System.out.println(isDayof(Day.valueOf(str)));
			str = s.nextLine();
		}
		s.close();		

	}
	
	
	
	public static boolean isDayof(Day day) {
		switch(day) {
		case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY: case FRIDAY :
			return false;
		case SATURDAY: case SUNDAY:
			return true;
		default:
			return false;
	
		}	
	}
}

