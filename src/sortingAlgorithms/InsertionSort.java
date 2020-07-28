package sortingAlgorithms;

public class InsertionSort {
	
	public void sort(int arr[]) {
		
		int n = arr.length;
		
		// Compare arr[i] with all previous elements arr[0]..arr[i-1]
		// and when arr[x] is less than arr[i] swap arr[x+1] with arr[i]
		// and move all arr[x+2]..arr[i-1] up by one index
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			// Move elements of arr[0..i-1], that are greater than
			// key to one position ahead of their current position
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
}

// Time complexity: O(n^2) - single for loop