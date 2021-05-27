// Problem:
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
// Answer: 6857
public class Problem_003 {

	public static String work(){
		String results = "Didn't work";
		final long NUM = 600851475143L;
		long i, temp;
		
		for(i = 2; i < NUM / 2; i++) {
			if (NUM % i == 0) {
				temp = NUM / i;
				System.out.println("Num = " + temp + "\ni = " + i);
				if(isPrime(temp)) {
					results = "Largest = " + Long.toString(temp);
					return results;
				}
			}
		}
		
		return results;
	}
	
	private static boolean isPrime(long val) {
		if (val % 2 == 0) return true;
		
		int i;
		double sqr = Math.sqrt(val);
		long floor = (long) (sqr + .5);
				
		for (i = 3; i <= floor; i += 2) {
			if (val % i == 0) {
				System.out.println("Divisible by " + i);
				return false;
			}
		}
		return true;
	}
}
