import java.math.BigInteger;

// Problem:
/*
 * n! means n * (n − 1) * ... * 3 * 2 * 1
 * 
 * For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800,
 * and the sum of the digits in the number 10! is
 *  3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *  
 *  Find the sum of the digits in the number 100!
 */

// Answer: 648

public class Problem_020 {
	
	public static String work(){
		final int START = 1;
		final int END = 100;
		
		String results = "hello";
		int i, sum = 0;
		BigInteger fac = BigInteger.ONE;
		String num;
		
		for (i = START; i <= END; i++) {
			BigInteger bi = new BigInteger(Integer.toString(i));
			fac = fac.multiply(bi);
			System.out.println("fac(" + i + ") = " + fac);
		}
		
		num = fac.toString();
		for (i = 0; i < num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		
		results = "Sum is " + sum;
		return results;
	}
	
}