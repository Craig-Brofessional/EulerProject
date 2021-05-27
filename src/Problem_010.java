// Problem:
/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

// Answer: 142913828922

public class Problem_010 {
	
	public static String work(){
		final int TOPNUM = 2000000;
		String results = "hello";
		long sum = 2; //Skipping 2 in the loop because it is the only even prime
		int num;
		
		for (num = 3; num < TOPNUM; num += 2) {
			if (Common.isPrime(num)) {
				sum += num;
			}
		}
		
		results = "Sum = " + sum;
		return results;
	}
	
}