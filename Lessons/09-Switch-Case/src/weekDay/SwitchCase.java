package weekDay;

import java.util.Scanner;

public class SwitchCase {
		
	Scanner scan = new Scanner(System.in);
	int weekDay;
		
	public void dayCalc() {
			
		System.out.println("Enter day in number (values from 1 to 7): ");
		weekDay = scan.nextInt();
		
		switch(weekDay) {

		case 1:
			System.out.println("Today is Sunday!");
			break;
			
			case 2:
			System.out.println("Today is Monday!");
			break;
			
			case 3:
			System.out.println("Today is Tuesday!");
			break;
			
			case 4:
			System.out.println("Today is Wednesday!");
			break;
			
			case 5:
			System.out.println("Today is Thursday!");
			break;
			
			case 6:
			System.out.println("Today is Friday!");
			break;
			
			case 7:
			System.out.println("Today is Saturday!");
			break;
			
			default:
			System.out.println("Invalid value! Try another number!");
			break;
			
		}
		
		
		}
	}
