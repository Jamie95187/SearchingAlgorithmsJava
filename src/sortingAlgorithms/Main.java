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
	}
	
}