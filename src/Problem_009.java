// Problem:
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 				a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

// Answer: 

public class Problem_009 {
	
	public static String work(){
		String results = "hello";
		
		int a, b, c;
		
		for (a = 0; a < 800; a++) {
			for (b = a + 1; b < 800; b++) {
				for (c = b + 1; c < 800; c++) {
					
					if (isPythTriple(a, b, c)) {
						if((a + b + c) ==  1000) {
							results = "a = " + a + "\nb = " + b + "\nc = " + c + "\nProduct = " + (a * b * c);
							return results;
						}
					}
					
				}
			}
		}
		return results;
	}
	
	private static boolean isPythTriple(int a, int b, int c) {
		if ((a * a) + (b * b) == (c * c))
			return true;
		else return false;
	}
}