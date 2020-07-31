package sortingAlgorithms;

/*
 * Heap sort is a comparison based sorting technique on Binary Heap data structure.
 * 
 * Heap Sort Algorithm for sorting in increasing order:
 * 
 * 1) Build a max heap (a binary tree in which every level except possibly the last is completely filled and is ordered) from the input data.
 * 2) At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing
 * the size of the heap by 1. Finally, heapify the root of the tree.
 * 3) Repeat above steps while size of heap is greater than 1.
 * 
 */

public class HeapSort {
	
	public void sort(int arr[]) {
		int n = arr.length;
		
		// Build heap (rearrange array)
		for (int i = (n / 2) - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		// One by one extract element from heap
		for (int i = n - 1; i > 0; i--) {
			
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
			
		}
	}
	
	// To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
	
	public void heapify(int arr[], int n, int i) {
		
		int largest = i; // Initialise largest as root
		int l = 2*i + 1; // left child of root
		int r = 2*i + 2; // right child of root
		
		// If left child is larger than root
		
		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		
		// If right child is larger than largest so far
		
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		
		// If largest is not root
		
		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}
	
}
