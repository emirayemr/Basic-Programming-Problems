// OUTLINE OF THE PROLEM
/*
	Aim is finding the letter grade of a student for a chosen course according to grades that entered by the student.
	The components of the final course grade for some university course are as follows:
	  Midterm examination:  40%
	  Process essay:        30% 
	  Discussion sessions:  20% 
	  In-lecture quizzes:   10%
	
	Letter grade table for this course: A (90-100)
	                                    A- (86-90)
	                                    B+ (82-86)
	                                    B (78-82)
	                                    B- (74-78)
	                                    C+ (70-74)
	                                    C (66-70)
	                                    C- (62-66)
	                                    D+ (58-62)
	                                    D (54-58)
	                                    F (0-54)
	
	The program should get points earned from each component as input
	   and should give the resulting letter grade for the course as output
 */

// SOLUTION OF THE PROBLEM 
import java.util.Scanner;

public class grade_calculation {
	
	public static void main(String[] args) {
		
		// getting the input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your midterm grade: ");
		double midterm = input.nextDouble();
		
		System.out.println("Please enter your essay grade: ");
		double essay = input.nextDouble();
		
		System.out.println("Please enter your discussion grade: ");
		double discussion = input.nextDouble();
		
		System.out.println("Please enter your quiz grade: ");
		double quiz = input.nextDouble();
		
		// the weights of the components
		double midtermW = 0.4;
		double essayW = 0.3;
		double discussionW = 0.2;
		double quizW = 0.1;
		
		// calculating the final grade
		double finalGrade = (double) midterm * midtermW +
									 essay * essayW +
									 discussion * discussionW +
									 quiz * quizW;
		
		// deciding the letter grade (*)
		String letterGrade;
		if (100 >= finalGrade && finalGrade > 90) {
			letterGrade = "A";
		}
		else if (90 >= finalGrade && finalGrade > 86) {
			letterGrade = "A-";
		}
		else if (86 >= finalGrade && finalGrade > 82) {
			letterGrade = "B+";
		}
		else if (82 >= finalGrade && finalGrade > 78) {
			letterGrade = "B";
		}
		else if (78 >= finalGrade && finalGrade > 74) {
			letterGrade = "B-";
		}
		else if (74 >= finalGrade && finalGrade > 70) {
			letterGrade = "C+";
		}
		else if (70 >= finalGrade && finalGrade > 66) {
			letterGrade = "C";
		}
		else if (66 >= finalGrade && finalGrade > 62) {
			letterGrade = "C-";
		}
		else if (62 >= finalGrade && finalGrade > 58) {
			letterGrade = "D+";
		}
		else if (58 >= finalGrade && finalGrade > 54) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		// giving outputs
		System.out.println("Your final grade: " + finalGrade);
		System.out.println("Your letter grade: " + letterGrade);
		
	}
}
