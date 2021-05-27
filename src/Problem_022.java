import java.io.*;
import java.util.Scanner;
import common.QSort.*;

// Problem:
/*
 * Using names.txt (right click and 'Save Link/Target As...'),
 * a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working
 * out the alphabetical value for each name, multiply this value
 * by its alphabetical position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order,
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 
 * 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */

// Answer: 871198282

public class Problem_022 {
	
	public static String work(){
		
		String results = "hello";
		Scanner scanny = null;
		QuickSort qSort = new QuickSortString();
		String[] names;
		long totalSum = 0;
		int numNames, length, wordSum;
		int i, j;
		
		try {
			scanny = new Scanner(new File(System.getProperty("user.dir") + "\\src\\p022_names.txt"));
			
			names = scanny.nextLine().replace("\"",  "").split(",");
			numNames = names.length;
			
			names = (String[])qSort.sortAll(names);
			
			for (i = 0; i < numNames; i++) {
				length = names[i].length();
				wordSum = 0;
				for (j = 0; j < length; j++) {
					wordSum += ((int)names[i].charAt(j) - 64);
					//System.out.print(names[i].charAt(j) + " " + ((int)names[i].charAt(j) - 64) + ", ");
				}
				//System.out.println("wordSum = " + wordSum);
				totalSum += wordSum * (i + 1);
			}
			
			System.out.println("numNames = " + numNames);
			results = "totalSum = " + totalSum;
			
		}
		catch (Exception ex){
			
		}
		finally {
			if (scanny != null)
				scanny.close();
		}
		
		return results;
	}
	
	
}