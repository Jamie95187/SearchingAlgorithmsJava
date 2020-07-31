package sortingAlgorithms;

public class QuickSort {
	
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int k = low; k < high; k++) {
			if (arr[k] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		// place pivot in the correct position
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		// Now all elements before the pivot are in the correct position (the smaller elements)
		return i+1;
	}
	
	/* Sorting algorithm
	 * 
	 * arr[] --> Array to be sorted.
	 * low --> Starting index,
	 * high --> Ending index
	 * 
	 */
	
	public void sort(int arr[], int low, int high) {
		if (low < high) {
			// pi is the partitioning index
			int pi = partition(arr, low, high);
			
			// Recursively sort elements before partition and after partition
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
}

/*
*
*	Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array 
*	around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
*	
*	    1) Always pick first element as pivot.
*	    2) Always pick last element as pivot (implemented below)
*	    3) Pick a random element as pivot.
*	    4) Pick median as pivot.
*	
*	The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, 
*	put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater 
*	elements (greater than x) after x. All this should be done in linear time.
*
* Time Complexity:
* Worst Case: always picking the largest or smallest element in the array O(n^2)
* Best Case: picking the middle value of the array O(nLogn)
*
*/