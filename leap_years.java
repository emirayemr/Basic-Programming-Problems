// 0UTLINE OF THE PROBLEM
/*
	Leap years are any year that can be evenly divided by 4.
	Except if it can be evenly divided by 100, then it isn't a leap year (2100, 2200...)
		However, if it can be evenly divided by 100 and 400, then it is a leap year (2000, 2400...)
	The program will get an year from the user and it will decide if it is a leap year.
 */

// SOLUTION OF THE PROBLEM
import java.util.Scanner;

public class leap_years {

	public static void main(String[] args) {
		System.out.println("Welcome to leap year checker!");
		
		// initialize the boolean variables
		boolean isLeapYear = false;
		
		// get input year
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the year will be checked: ");
		int year = input.nextInt();
		
		// decision control only for 2 negative conditions:
			/* divisible by 4 & not divisible by 100 -> leap year 
			   divisible by 4 & divisible by 100 & divisible by 400 -> leap year */
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				isLeapYear = true;
			} else {
				if (year % 400 == 0) {
					isLeapYear = true;
				}	
			}
		}
		
		if (isLeapYear) {
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is not a leap year.");
		}
		
	}
}
