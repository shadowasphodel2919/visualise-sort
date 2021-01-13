package sorter.algos;

import sorter.SortArray;

public interface ISortAlgorithm {
	public String getName();
	public long getDelay();
	public void runSort(SortArray array);
}
