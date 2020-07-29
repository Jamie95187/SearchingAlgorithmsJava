package sortingAlgorithms;

public class RecursiveInsertionSort {
	
	// Recursive function to sort an array using insertion sort
	
	public void sort(int[] arr, int n) {
		
		// Base case when there is only one element to sort
		
		if (n <= 1 ) {
			return;
		}
		
		// First sort n - 1 elements 
		// Recursive function to sort inner elements
		sort(arr, n-1);
		
		// Insert last element at its correct position in sorted array.
		int last = arr[n-1];
		int j = n - 2;
		
		while (j >= 0 && arr[j] > last) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = last;
		
	}
	
}

// Time complexity - same as recursive sort
//Best case - O(n)
//Worst case - O(n^2)
