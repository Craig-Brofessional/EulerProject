package common.QSort;

public abstract class QuickSortOld implements QuickSortInterface {
	
	protected interface QuickSortInterfaceProtected {
		
		void qSort(int lowerIndex, int higherIndex);
		boolean lessThan(Object obj1, Object obj2);
		boolean moreThan(Object obj1, Object obj2);
		void exchangeNumbers(int i, int j);
	}
	
	public abstract class QSort implements QuickSortInterfaceProtected {
		private Object array[];
	    private int length;
	 
	    public void sortAll(Object[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.length;
	        qSort(0, length - 1);
	    }

	    public void qSort(int lowerIndex, int higherIndex) {
	        int i = lowerIndex;
	        int j = higherIndex;
	        
	        Object pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        
	        while (i <= j) {
	        	while (lessThan(array[i], pivot)) {
	                i++;
	            }
	            while (moreThan(array[i], pivot)) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                i++;
	                j--;
	            }
	        }
	        
	        if (lowerIndex < j)
	            qSort(lowerIndex, j);
	        if (i < higherIndex)
	            qSort(i, higherIndex);
	    }
	    
	    public void exchangeNumbers(int i, int j) {
	        Object temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	}
}
