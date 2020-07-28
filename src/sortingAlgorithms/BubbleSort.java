package sortingAlgorithms;

public class BubbleSort {
	
	public void sort(int arr[]) {
		int n = arr.length;
		// Optimised bubble sort
		// boolean swapped;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					
					// Swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					// For optimised bubble sort
					// swapped = true;
				}
			}
			
			// If no swap occurred in inner loop then break
			// if (swapped == false)
			// 	break;
			
		}
	}
}

// Time complexity: O(n^2)

// The above solution can be optimised by checking the number of swaps
// in the inner loop

// Worse case for optimised bubble sort O(n^2) when the array is reversed.
// Best case is when it is already sorted O(n)