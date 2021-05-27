// Problem:
/*
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * 				n → n/2 (n is even)
 * 				n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 				
 * 				13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * 		Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

// Answer: 837799

public class Problem_014 {
	
	public static String work(){
		final int MAX_START = 1000000;
		String results = "hello";
		
		int startingNum;
		int temp, longest = 1, longestNum = 0;
		
		chainSequences(13);
		for (startingNum = 2; startingNum < MAX_START; startingNum++) {
			temp = chainSequences(startingNum);
			if (temp > longest) {
				longest = temp;
				longestNum = startingNum;
			}
		}
		
		results = "Longest chain = " + longest + " terms\nStarting number = " + longestNum;
		return results;
	}
	
	private static int chainSequences(long val) {
		int chains = 1;
		
		while (val !=  1) {
			if (val % 2 == 0)
				val = val / 2;
			else
				val = (val * 3) + 1;
			chains++;
		}
		return chains;
	}
	
}