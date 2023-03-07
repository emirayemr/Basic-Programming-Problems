// OUTLINE OF THE PROBLEM
/*
	For the quarter finals in Champions League 8 teams are seeded.
	Assume the teams to be matched are following:
		Roma, Barcelona, Juventus, Bayern Munich, Sevilla, Real Madrid, Manchester City, Liverpool

	The aim of the project is printing all possible combinations for the quarter final matches.
		Note that Team1 v Team2 is equivalent to Team2 v Team1
 */

// SOLUTION OF THE PROBLEM
import java.util.Scanner;

public class draw_simulator {

	public static void main(String[] args) {
		
		String[] teams = {"Roma", "Barcelona", "Juventus", "Bayern Munich", "Sevilla", "Real Madrid", "Manchester City", "Liverpool"};
		
		for (int i=0; i<8; i++) {
			
			String team1 = teams[i];
			int j = i+1;
			
			for (; j<8; j++) {
				
				String team2 = teams[j];
				System.out.println(team1+" - "+team2);
				
			}
			
		}
	}
}
