// OUTLINE OF THE PROBLEM
/*
	Aim is deciding if an applicant can get credit from a chosen bank. 

	Criteria of the bank for giving credit:
  	* If you are under 30 (inclusive) and you are an employee, you can get credit
  	* If you are between 31 and 40 years old (31 and 40 inclusive), you can get credit
  	* If you are over 40 (exclusive) and your credit rating is excellent, you can get credit

	The program will ask three inputs to the user:
  	* age, as an integer
  	* employee ("Yes" or "No")
 	* credit rating ("Excellent" or "Fair")
	
	and it should give the decision for the credit application ("Yes" or "No")
 */

//SOLUTION OF THE PROBLEM
package credit_approval;

import java.util.Scanner;

public class credit_approval {
	
	public static void main(String[] args) {
		System.out.println("Welcome to credit application decider!");
		
		// Boolean variables
		boolean employee = true;
		boolean creditRating = true;
		
		// get inputs and update the results
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		
		if (age <= 30) {
			System.out.println("Are you currently an employee? (Yes/No) ");
			String empInput = input.next();
			if (empInput.equals("No")) {
				employee = false;
			}
		} else if (40 < age) {
			System.out.println("Please enter your credit rating (Excellent/Fair): ");
			String crInput = input.next();
			if (crInput.equals("Fair")) {
				creditRating = false;
			}
		}
		
		// give the decision for the credit application
		if (employee && creditRating) {
			System.out.println("Yes, you are eligible for credit.");
		} else {
			System.out.println("No, unfortunately you are not eligible for credit.");
		}
	
	}
	
}