import common.*;

// Problem:
/*
 * Let d(n) be defined as the sum of proper divisors of n (numbers
 * less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are
 * an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
 * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */

// Answer: 31626

public class Problem_021 {
	
	public static String work(){
		final int START = 1;
		final int END = 9999;
		
		String results = "hello";
		int i, totalSum = 0;
		
		for (i = START; i <= END; i++) {
			totalSum += isAmicablePair(i);;
		}
		results = "Sum of amicable numbers = " + totalSum;
		
		//Testing
//		int temp = 220;
//		results = "Sum of proper divisors of " + temp + " = " + getSum(temp);
//		results = "isAmicablePair(" + temp + ") = " + isAmicablePair(temp);
		
		return results;
	}
	
	//returns 0 if not amicable pair, or the sum of both members if it
	//is an amicable pair
	private static int isAmicablePair(int num) {
		int divSum = Common.getSumProperDivisor(num);
		int potentialPair = Common.getSumProperDivisor(divSum);
		if (num == potentialPair && (divSum != num)) {
			System.out.print("Pair (" + num + ", " + divSum + ")");
			System.out.println("Returning " + num);
			return num;
		}
		else
			return 0;
	}
}