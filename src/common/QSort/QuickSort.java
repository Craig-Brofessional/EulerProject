package common.QSort;

public abstract class QuickSort {
	private Object array[];
    
    public Object[] sortAll(Object[] args) {
    	array = args;
		int low = 0;
		int high = array.length - 1;
 
		quickSort(array, low, high);
		return array;
	}
 
	public void quickSort(Object[] arr, int low, int high) {
 
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		//pick the pivot
		int middle = low + (high - low) / 2;
		Object pivot = arr[middle];
 
		//make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (lessThan(arr[i], pivot)) {
				i++;
			}
 
			while (moreThan(arr[j], pivot)) {
				j--;
			}
 
			if (i <= j) {
				Object temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		//recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
    
    protected abstract boolean lessThan(Object obj1, Object obj2);
    protected abstract boolean moreThan(Object obj1, Object obj2);
}
