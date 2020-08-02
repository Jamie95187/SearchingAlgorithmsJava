package sortingAlgorithms;

public class CountingSort {
	public void sort(int arr[]) {
		int n = arr.length;
		
		int output[] = new int[n];
		
		// Create a count array to store count of individual characters and initialise to 0
		// The size of count array is the arr_max
		int count[] = new int[256];
		for (int i = 0; i < 256; i++) {
			count[i] = 0;
		}
		
		// store count of each character
		for (int i = 0; i < n; i++) {
			++count[arr[i]];
		}
		
		// Change count[i] so that count[i] now contains actual position of this character in output array
		for (int i = 1; i < 256; i++) {
			count[i] += count[i-1];
		}
		
		// Build output character array
		// To make it stable we operate in reverse order
		for (int i = n-1; i >= 0; i--) {
			output[count[arr[i]]-1] = arr[i];
			--count[arr[i]];
		}
		
		// Copy the output array to arr, so that arr now contains sorted characters
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}
}
