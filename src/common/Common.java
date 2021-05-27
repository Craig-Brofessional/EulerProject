package common;

public final class Common {

	private Common() {
		
	}
	
	public static boolean isPrime(long val) {
		if (val % 2 == 0) return true;
		
		int i;
		double sqr = Math.sqrt(val);
		long floor = (long) (sqr + .5);
				
		for (i = 3; i <= floor; i += 2) {
			if (val % i == 0) {
				//System.out.println("Divisible by " + i);
				return false;
			}
		}
		return true;
	}
	
	public static int getSumProperDivisor(int num) {
		int i, sum = -num;
		double sqr = Math.sqrt(num);
		int floor = (int) (sqr + .5);
		//System.out.println("floor = " + floor);
		
		for (i = 1; i <= floor; i ++) {
			if (num % i == 0) {
				//System.out.print(i + ", " + (num / i) + " ");
				sum += i;
				sum += num / i;
			}
		}
		
		return sum;
	}
	
	public static int getSumProperDivisorNoSquares(int num) {
		int i, sum = -num;
		double sqr = Math.sqrt(num);
		int floor = (int) (sqr + .5);
		//System.out.println("floor = " + floor);
		
		for (i = 1; i <= floor; i ++) {
			if (num % i == 0) {
				//System.out.print(i + ", " + (num / i) + " ");
				sum += i;
				if (i != (num / i))
					sum += num / i;
			}
		}
		
		return sum;
	}
}
