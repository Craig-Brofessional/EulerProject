// Problem:
/*
 * 
 */

// Answer: 

public class Problem_015 {
	
	public static String work(){
		final int NUM_SIDES = 2;
		String results = "hello";
		long last, current = 2;
		int dim;
		
		for (dim = 2; dim <= NUM_SIDES; dim++) {
			last = current;
			current = 2 * last;
			//current += 2 * ((int) Math.pow(3, dim - 2) + 1);
			current += (4 * dim) / ((((int) Math.sqrt(1 - 4*dim) + 1) ^ 2) * ((int) Math.sqrt(1 - 4*dim)));
		}
		
		results = "Number of paths for a " + NUM_SIDES + " x " + NUM_SIDES + " graph = " + current;
		return results;
	}
}