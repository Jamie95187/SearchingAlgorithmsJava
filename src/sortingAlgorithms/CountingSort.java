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

/* Time complexity: O(n+k) where n is the number of elements and k is the range of input
 * 	Points to be noted:
 *	1. Counting sort is efficient if the range of input data is not significantly greater than the number of objects to be sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K.
 *	2. It is not a comparison based sorting. It running time complexity is O(n) with space proportional to the range of data.
 *	3. It is often used as a sub-routine to another sorting algorithm like radix sort.
 *	4. Counting sort uses a partial hashing to count the occurrence of the data object in O(1).
 *	5. Counting sort can be extended to work for negative inputs also.
*/
