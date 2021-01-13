package sorter.algos;

import sorter.SortArray;

public class BubbleSort implements ISortAlgorithm{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bubble Sort";
	}

	@Override
	public long getDelay() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public void runSort(SortArray array) {
		int len = array.arraySize();
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - i - 1; j++) {
				if(array.getValue(j) > array.getValue(j + 1)) {
					array.swap(j, j+1, 2);
				}
			}
		}
	}
	
}
