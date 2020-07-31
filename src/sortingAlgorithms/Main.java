package sortingAlgorithms;

class Main {
	
	public static int[] createArray(int size) {
		int arr[] = new int[size];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50);
		}
		return arr;
	}
 	
	public static void main(String[] args) {
		
		// Testing Selection sort
		
		int arr[] = createArray(50);
		SelectionSort select_algorithm = new SelectionSort();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println("\n");
		select_algorithm.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		
		System.out.println("\n \n");
		
		// Testing bubble sort
		
		int arr2[] = createArray(50);
		BubbleSort bubble_sort = new BubbleSort();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " , ");
		}
		bubble_sort.sort(arr2);
		System.out.println("\n");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " , ");
		}
		
		System.out.println("\n \n");
		
		// Testing insertion sort
		
		int arr3[] = createArray(50);
		InsertionSort insertion_sort = new InsertionSort();
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " , ");
		}
		insertion_sort.sort(arr3);
		System.out.println("\n");
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " , ");
		}
		
		System.out.println("\n \n");
		
		// Testing recursive insertion sort
		
		int arr4[] = createArray(50);
		RecursiveInsertionSort ris = new RecursiveInsertionSort();
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " , ");
		}
		ris.sort(arr4, 50);
		System.out.println("\n");
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " , ");
		}
		
		System.out.println("\n \n");
		
		// Testing merge sort
		
		int arr5[] = createArray(50);
		MergeSort ms = new MergeSort();
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + ", ");
		}
		arr5 = ms.mergeSort(arr5);
		System.out.println("\n");
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + ", ");
		}
		
		System.out.println("\n \n");
		
		// Testing quick sort
		
		int arr6[] = createArray(50);
		QuickSort qs = new QuickSort();
		for (int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + ", ");
		}
		qs.sort(arr6, 0, arr6.length-1);
		System.out.println("\n");
		for (int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + ", ");
		}
		
		System.out.println("\n \n");
		
		// Testing heap sort
		
		int arr7[] = {10, 15, 20, 40, 50, 25};
		HeapSort hs = new HeapSort();
		for (int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + ", ");
		}
		hs.sort(arr7);
		System.out.println("\n");
		for (int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + ", ");
		}
	}
	
}