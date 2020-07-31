package sortingAlgorithms;
import java.util.Arrays;

// Divide and conquer, break problem into smaller ones to solve it
// Split array into individual arrays and merge them together

// Merge two sorted arrays together

public class MergeSort {
	
	// Recursive method that has access to the arrays
	
	public int[] mergeSort(int[] a) {
		int n = a.length;
		
		if (n == 1) {
			return a;
		}
		
		int[] arrayOne = Arrays.copyOfRange(a, 0, (n/2)+n%2);
		int[] arrayTwo = Arrays.copyOfRange(a, (n/2)+n%2, n);
		
		arrayOne = mergeSort(arrayOne);
		arrayTwo = mergeSort(arrayTwo);
		
		return merge(arrayOne, arrayTwo);
	}
	
	// Merge function that combines two arrays that are sorted.
	
	public int[] merge(int[] a, int[] b) {
		
		int[] c = new int[a.length + b.length];
		int nextIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		
		while (aIndex < a.length  && bIndex < b.length) {
			if (a[aIndex] > b[bIndex]) {
				c[nextIndex] = b[bIndex];
				bIndex++;
				nextIndex++;
			} else {
				c[nextIndex] = a[aIndex];
				aIndex++;
				nextIndex++;
			}
		}
		
		// At this point either a or b is empty
		// Add remaining elements to c array
		
		while (aIndex < a.length) {
			c[nextIndex] = a[aIndex];
			aIndex++;
			nextIndex++;
		}
		
		while (bIndex <  b.length) {
			c[nextIndex] = b[bIndex];
			bIndex++;
			nextIndex++;
		}
		
		return c;
	}
	
}

// Time complexity:
// worst case: O(nlogn)
