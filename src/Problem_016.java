import java.math.*;
// Problem:
/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 */

// Answer: 1366

public class Problem_016 {
	
	public static String work(){
		String results = "hello";
		String numstr;
		int i, sum = 0;
		BigInteger num = new BigInteger("2");
		BigInteger two = new BigInteger("2");
		
		for (i = 2; i <= 1000; i++) {
			num = two.multiply(num);
			//System.out.println("2 ^ " + i + " = " + num.toString());
		}
		
		numstr = num.toString();
		sum = 0;
		for (i = 0; i < numstr.length(); i++) {
			sum += Character.getNumericValue(numstr.charAt(i));
		}
		
		results = "sum = " + sum;
		return results;
	}
	
}