import java.io.File;
import java.util.Scanner;

// Problem:
/*
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * 
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'),
 * a 15K text file containing a triangle with one-hundred rows.
 * 
 * 
 * NOTE: This is a much more difficult version of Problem 18. It is not possible to try every route
 *  to solve this problem, as there are 299 altogether! If you could check one trillion (1012) routes
 *   every second it would take over twenty billion years to check them all. There is an efficient algorithm to solve it. ;o)


// Answer: 
*/
public class Problem_067 {
	static int[] maxes;
	
	public static String work(){
		final int TRI_SIZE = 100;
//		final int TRI_SIZE = 4;
		String results = "hello";
		Scanner scanny;
		
		int[][] array = new int[TRI_SIZE][TRI_SIZE];
		int i, j, strPos;
		
//		String triangle = "" + 
//		"75 " +
//		"95 64 " +
//		"17 47 82 " +
//		"18 35 87 10 " +
//		"20 04 82 47 65 " +
//		"19 01 23 75 03 34 " +
//		"88 02 77 73 07 63 67 " +
//		"99 65 04 28 06 16 70 92 " +
//		"41 41 26 56 83 40 80 70 33 " +
//		"41 48 72 33 47 32 37 16 94 29 " +
//		"53 71 44 65 25 43 91 52 97 51 14 " +
//		"70 11 33 28 77 73 17 78 39 68 17 57 " +
//		"91 71 52 38 17 14 91 43 58 50 27 29 48 " +
//		"63 66 04 68 89 53 67 30 73 16 69 87 40 31 " +
//		"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";
		
//		String triangle = "" + 
//		"03 " +
//		"07 04 " +
//		"02 04 06 " +
//		"08 05 09 03 ";
		try {
			scanny = new Scanner(new File(System.getProperty("user.dir") + "\\src\\p067_triangle.txt"));
		
			strPos = 0;
			for(i = 0; i < TRI_SIZE; i++) {
				for (j = 0; j <= i; j++) {
					int temp;
					temp = scanny.nextInt();
					//temp = Integer.parseInt(triangle.substring(strPos, strPos + 2));
					array[i][j] = temp;			
					strPos += 3;
				}
			}
			
			for(i = 0; i < TRI_SIZE; i++) {
				for (j = 0; j <= i; j++) {
					System.out.print(String.format("%2d", array[i][j]) + " ");
				}
				System.out.println();
			}
			//System.exit(0);
			
			maxes = new int[TRI_SIZE];		
		
			int row, boundary, option;
			
			//for(row = TRI_SIZE - 1; row > TRI_SIZE - 3; row--) { //bottom to top
			for(row = TRI_SIZE - 1; row > 0; row--) { //bottom to top
				int[] tempMaxes = new int[TRI_SIZE];
				copyVals(maxes, tempMaxes);
				for (boundary = 0; boundary <= row; boundary++) { // one position in on the row to one position from the end of the row
					int bottom, top;
					bottom = 0;
					top = 1;
					
					if (row == TRI_SIZE - 1)
						top = 0;					
					
					System.out.print("bound = " + boundary + "(");
					for (option = boundary - bottom; option <= boundary + top; option++) {
						int temp;
						if (row == TRI_SIZE - 1)
							temp = array[row][boundary];
						else
							temp = tempMaxes[option] + array[row][boundary];
						
						System.out.print("[" + String.format("%2d", option) + "]" + String.format("%2d", array[row][boundary]) + 
								" + " + tempMaxes[option] + " = " + temp + "\t");
						if (temp > maxes[boundary]) {
							maxes[boundary] = temp;
						}
					}
					System.out.println(")");
				}
				printMaxes(TRI_SIZE - 1);
			}
			
			maxes[0] += array[0][0];
			maxes[1] += array[0][0];
			
			if (maxes[0] > maxes[1])
				results = Integer.toString(maxes[0]);
			else
				results = Integer.toString(maxes[1]);
		}
		catch (Exception ex) {
			System.out.flush();
			System.out.println();
			ex.printStackTrace();
		}
		finally
		{
//			if (scanny != null)
//				scanny.close();
		}
		
		
		return results;
	}
	
	private static void printMaxes(int end) {
		int i;
		System.out.print("Maxes = ");
		for (i = 0; i <= end; i++) {
			System.out.print(maxes[i] + "  ");
		}
		System.out.println();
	}
	
	private static void copyVals(int[] src, int[] dest) {
		int i;
		for (i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
		
	}
}