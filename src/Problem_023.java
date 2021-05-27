import common.*;

// Problem:
/*
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number. For example, the sum of the proper divisors
 * of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than
 * n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest
 * number that can be written as the sum of two abundant numbers is 24. 
 * By mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However, this upper limit
 * cannot be reduced any further by analysis even though it is known that the
 * greatest number that cannot be expressed as the sum of two abundant numbers
 * is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

// Answer: 4179871

public class Problem_023 {
	static int[] abundantNums;
	static int numAbundants;
	
	public static String work(){
		final int UPPER_LIMIT = 28123;
		String results = "hello";
		long sum = 0;
		int i, counter;
		abundantNums = new int[UPPER_LIMIT];
		
		//Find all abundant numbers under UPPER_LIMIT
		counter = 0;
		for (i = 12; i < UPPER_LIMIT; i++) {
			if (Common.getSumProperDivisorNoSquares(i) > i) {
				abundantNums[counter] = i;
				counter++;
			}
		}
		numAbundants = counter;
		
		for (i = 1; i <= UPPER_LIMIT; i++) {
			if (!(isSumOfAbundants(i))) {
				sum += i;
				//System.out.print("isSumOfAbundants(" + i + ") = false,  ");
				System.out.println("(" + i + ") sum is " + sum); 
			}
		}
		
		results = "Sum = " + sum;
		
		return results;
	}
	
	//Loop through all abundant numbers and see if a pair will add to equal num
	private static boolean isSumOfAbundants(int num) {
		int i, j;
		for (i = 0; i < numAbundants; i++) {
			if (num <= abundantNums[i])
				return false;
			
			for (j = 0; j < numAbundants; j++) {
				if ((abundantNums[i] + abundantNums[j]) == num) {
					return true;
				}
				else if ((abundantNums[i] + abundantNums[j]) > num) {
					j = numAbundants;
				}
			}
		}
		return false;
	}
	
}