package sortingAlgorithms;

class SelectionSort {
	
	public void sort(int arr[]) {
		// Move one element at a time through unsorted array
		for (int i = 0; i <  arr.length; i++) {
			
			// Find the minimum element in the unsorted array
			int min_index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			// Swap the minimum element with the first element
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

}

// Time Complexity: there are two nested loops
// Best case - O(n^2) 
// Worst case - O(n^2)
