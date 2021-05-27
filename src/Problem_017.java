// Problem:
/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
 * and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is
 * in compliance with British usage.
 */

// Answer: 21124

public class Problem_017 {
	
	public static String work(){
		final int START = 1, END = 999;
//		final int START = 115, END = 115;
		final int ONE = 3, TWO = 3, THREE = 5, FOUR = 4, FIVE = 4;
		final int SIX = 3, SEVEN = 5, EIGHT = 5, NINE = 4, TEN = 3;
		
		final int ELEVEN = 6, TWELVE = 6, THIRTEEN = 8, FOURTEEN = 8, FIFTEEN = 7;
		final int SIXTEEN = 7, SEVENTEEN = 9, EIGHTEEN = 8, NINETEEN = 8;
		
		final int TWENTY = 6, THIRTY = 6, FORTY = 5, FIFTY = 5;
		final int SIXTY = 5, SEVENTY = 7, EIGHTY = 6, NINETY = 6;
		
		final int HUNDRED = 7, THOUSAND = 8, AND = 3;
		String results = "hello";
		int num, temp, currentWord;
		long sum = 0;
		
		for (num = START; num <= END; num++) {
			currentWord = 0;
			
			//1XX - 9XX
			temp = num / 100;
			if (temp >= 1 && temp <= 9) {
				switch(temp) {
					case 1:
						currentWord += ONE;						
						break;
					case 2:
						currentWord += TWO;						
						break;
					case 3:
						currentWord += THREE;						
						break;
					case 4:
						currentWord += FOUR;						
						break;
					case 5:
						currentWord += FIVE;						
						break;
					case 6:
						currentWord += SIX;						
						break;
					case 7:
						currentWord += SEVEN;						
						break;
					case 8:
						currentWord += EIGHT;						
						break;
					case 9:
						currentWord += NINE;						
						break;
				}
				currentWord += HUNDRED;
			}
			
			//X00 - X99
			temp = num % 100;
			if (temp > 0) {	
				if (currentWord > 0)
					currentWord += AND;
				
				//X10 - X19
				if (temp >= 10 && temp <= 19) {
					switch (temp) {
						case 10:
							currentWord += TEN;
							break;
						case 11:
							currentWord += ELEVEN;						
							break;
						case 12:
							currentWord += TWELVE;						
							break;
						case 13:
							currentWord += THIRTEEN;						
							break;
						case 14:
							currentWord += FOURTEEN;						
							break;
						case 15:
							currentWord += FIFTEEN;						
							break;
						case 16:
							currentWord += SIXTEEN;						
							break;
						case 17:
							currentWord += SEVENTEEN;						
							break;
						case 18:
							currentWord += EIGHTEEN;						
							break;
						case 19:
							currentWord += NINETEEN;						
							break;
					}
				}
				//X20 - X99 or X01 - X09
				else {
					switch (temp / 10) {
						case 2:
							currentWord += TWENTY;						
							break;
						case 3:
							currentWord += THIRTY;						
							break;
						case 4:
							currentWord += FORTY;						
							break;
						case 5:
							currentWord += FIFTY;						
							break;
						case 6:
							currentWord += SIXTY;						
							break;
						case 7:
							currentWord += SEVENTY;						
							break;
						case 8:
							currentWord += EIGHTY;						
							break;
						case 9:
							currentWord += NINETY;						
							break;
					}
					
					//XX1 - XX9
					temp = temp % 10;
					switch (temp) {
						case 1:
							currentWord += ONE;						
							break;
						case 2:
							currentWord += TWO;						
							break;
						case 3:
							currentWord += THREE;						
							break;
						case 4:
							currentWord += FOUR;						
							break;
						case 5:
							currentWord += FIVE;						
							break;
						case 6:
							currentWord += SIX;						
							break;
						case 7:
							currentWord += SEVEN;						
							break;
						case 8:
							currentWord += EIGHT;						
							break;
						case 9:
							currentWord += NINE;						
							break;
					}
				}
				
				
			}
			
			sum += currentWord;
		}
		sum += ONE + THOUSAND;
		
		results = "Total letters used = " + sum;
		return results;
	}
	
}