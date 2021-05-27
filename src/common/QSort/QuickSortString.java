package common.QSort;

public class QuickSortString extends QuickSort {
	
	
	@Override
	protected boolean lessThan(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		return str1.compareTo(str2) < 0;
	}

	@Override
	protected boolean moreThan(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		return str1.compareTo(str2) > 0;
	}
}
