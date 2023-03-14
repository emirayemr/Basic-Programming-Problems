// OUTLINE OF THE PROBLEM
/*
	A list of elected parties and their duration intervals for being government are given.
	The aim is to calculate the total number of years of a particular party being in power.

	Program will get a party name as input, and it should give its total number of yeats being in power.
*/

// SOLUTION OF THE PROBLEM

package government_history;
import java.util.Scanner;
public class government_history {
	
	public static void main(String[] args) {	
		// Given lists
		String[] parties = {"AKP", "ANAP", "AP", "CGP", "CHP", "CKMP", "DP", "DSP", "DTP",
							"DYP","HDP", "MGP", "MHP", "MP","MSP", "RP", "SHP", "YTP"};
		String[][] dates = new String[][] {{"2002-2023"}, 
						   {"1983-1991", "1997-2002"}, 
				                   {"1961-1962", "1965-1974", "1975-1977", "1977-1978", "1979-1980"}, 
						   {"1963-1965", "1971-1974", "1978-1979", "2015-2015"}, 
						   {"1923-1935", "1935-1950", "1971-1973", "1974-1974", "1977-1977", "1978-1979", "1995-1996"}, 
						   {"1962-1963", "1965-1965"}, 
						   {"1950-1960"},	
						   {"1997-2002"}, 
						   {"1997-1999"}, 
					           {"1991-1997", "1996-1997"}, 
					           {"2015-2015"}, 
						   {"1971-1973"}, 
						   {"1975-1977", "1977-1978", "1999-2002"}, 
					           {"1965-1965"}, 
						   {"1974-1974", "1975-1977", "1977-1978"}, 
						   {"1996-1997"}, 
						   {"1991-1995"}, 
						   {"1962-1963", "1965-1965"} };
		
		Scanner input = new Scanner(System.in);								   
		System.out.println("Please enter a party name: ");	
		String party = input.next();
		
		boolean found = false;
		int idx = 0;
		
		for (int i=0; i < parties.length; i++) {
			if (party.equals(parties[i])) {
				idx = i;
				found = true;
			}
		}
		
		if (found) {
			String[] party_dates = dates[idx];
			int sum = 0;
			
			for (String date : party_dates) {
				
				int begin = Integer.valueOf(date.substring(0, 4));
				int end = Integer.valueOf(date.substring(5, 9));
				
				sum += (end-begin+1);
			}
			System.out.println(party + " ruled for " + sum + " years.");		
		}
		else {
			System.out.println("Party name is invalid.");
		}
		
	}
		
}
	
	
