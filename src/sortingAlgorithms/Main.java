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
	}
	
}