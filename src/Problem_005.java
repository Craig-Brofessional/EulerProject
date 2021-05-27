// Problem:
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
// Answer: 232792560 

public class Problem_005 {

	public static String work(){
		String results = "hello";
		long small = 20L;
		
		while (!(isDivisible(small))) {
			small += 20;
			if (small % 1000000 == 0) {
				System.out.println("small = " + small);
			}
		}
		
		System.out.println("The smallest positive number is " + small);
		return results;
	}
	
	private static boolean isDivisible(Long num) {
		int i;
		for(i = 19; i > 0; i--) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}
	
}
