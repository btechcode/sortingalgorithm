package sorting;
import java.util.Arrays;

public class BubbleSort {

	// bubbleSort method
	public static void bubbleSort(int[] array) {
		if(array.length <=1) { //if array length less or equal to 1 no need to go through sorting process
			return;
		}
		try {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					// swapping elements help of temp variable
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {

		int[] array = { 1,3,2,5,4,6 };

		// Calling bubbleSort() in static way
		BubbleSort.bubbleSort(array);

		// Printing array using Arrays class
		System.out.println("Sorted Array (Using Bubble Sort)" + Arrays.toString(array));

		// Printing array using enhanced for-loop

		System.out.println("Sorted Array using:(enhanced for loop:)");
		for (int arr : array) {
			System.out.println(arr);
		}
	}
}
