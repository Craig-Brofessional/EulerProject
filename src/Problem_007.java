// Problem:
/*
 * By listing the first six prime numbers:
 * 			2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

// Answer: 104743

public class Problem_007 {
	
	public static String work(){
		String results = "hello";
		int primes = 1, num = 1;
		
		while (primes < 10001) {
			num += 2;
			if (isPrime(num)) {
				primes++;
			}
		}
		
		results = "10001th Prime = " + num;
		return results;
	}
	
	private static boolean isPrime(long val) {
		if (val % 2 == 0) return true;
		
		int i;
		double sqr = Math.sqrt(val);
		long floor = (long) (sqr + .5);
				
		for (i = 3; i <= floor; i += 2) {
			if (val % i == 0) {
				//System.out.println("Divisible by " + i);
				return false;
			}
		}
		return true;
	}
	
}
