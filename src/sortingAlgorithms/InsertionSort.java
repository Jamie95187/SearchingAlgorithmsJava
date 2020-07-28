package sortingAlgorithms;

public class InsertionSort {
	
	public void sort(int arr[]) {
		
		int n = arr.length;
		
		// Compare arr[i] with all previous elements arr[0]..arr[i-1]
		// and swap when the arr[i-x] is greater than arr[i]
		
		for (int i = 1; i < n - 1; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
}

// Time complexity: O(n^2) - double nested loop