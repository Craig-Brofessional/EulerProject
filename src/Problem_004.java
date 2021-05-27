// Problem:
/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product
 * of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product
 * of two 3-digit numbers.
 */
// Answer: 906609
public class Problem_004 {

	public static String work(){
		String results = "hello";
		int num1, num2, palin;
		int max = 0;

		for (num1 = 999; num1 > 99; num1--) {
			for (num2 = num1; num2 > 99; num2--) {
				palin = num1 * num2;
				
				if(isPalindrome(palin)) {
					if (palin > max) {
						max = palin;
					}
				}
			
			}
		}
		
		results = "Max Palindrome = " + Integer.toString(max);
		return results;
	}
	
	private static boolean isPalindrome(int num) {
		String numstr = Integer.toString(num);
		int i, lngth = numstr.length();
		
		for (i = 0; i < (lngth / 2); i++) {
			if (numstr.charAt(i) != numstr.charAt(lngth - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
}
