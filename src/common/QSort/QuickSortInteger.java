package common.QSort;

public class QuickSortInteger extends QuickSort {
	
	
	@Override
	protected boolean lessThan(Object obj1, Object obj2) {
		Integer int1 = (Integer) obj1;
		Integer int2 = (Integer) obj2;
		System.out.println((int1.compareTo(int2) < 0) + ", " + int1 + " < " + int2);
		return (int1.compareTo(int2) < 0);
	}

	@Override
	protected boolean moreThan(Object obj1, Object obj2) {
		Integer int1 = (Integer) obj1;
		Integer int2 = (Integer) obj2;
		System.out.println((int1.compareTo(int2) > 0 )+ ", " + int1 + " > " + int2);
		return (int1.compareTo(int2) > 0);
	}
}
