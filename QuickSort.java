
public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 80, 31, 1, 3, 5, 98, 1, 33, 58, 100 };
		System.out.println("Array before sorting ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Array after sorting ");
		quickSortAlgo(array, 0, array.length - 1);
		for (int ar : array) {
		System.out.print(ar + " ");
	}

}
	
	
	public static int arrayPartition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = (start - 1);
	for (int j = start; j < end; j++) {
		if (array[j] <= pivot) {
			i++;
			int swap = array[i];
			array[i] = array[j];
			array[j] = swap;
	}
	}
	
		int swap = array[i + 1];
		array[i + 1] = array[end];
		array[end] = swap;
		return i + 1;
	}
	public static void quickSortAlgo(int[] arrayTobeSorted, int start, int end) {
		if (start < end) {
			int pivot = arrayPartition(arrayTobeSorted, start, end);
			quickSortAlgo(arrayTobeSorted, start, pivot - 1);
			quickSortAlgo(arrayTobeSorted, pivot + 1, end);
	}
}
}
