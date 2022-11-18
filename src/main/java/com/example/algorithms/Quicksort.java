package com.example.algorithms;

public class Quicksort {

	/*
	 * Quicksort is a divide and conquer algorithm. It performs a fast sort by
	 * dividing the array into two parts, sorting each part recursively and
	 * then merging the two sorted parts.
	 *
	 * The partition positions for each element happen to be in the middle of
	 * the array, resulting in a binary tree of height log(n). Therefore, the
	 * time complexity of quicksort is O(n log(n)).
	 *
	 * When we select the left-most or right-most element as the pivot, the
	 * partitions positions for each element happen to be at the edges of the
	 * array, resulting in a binary tree of height n. Therefore, the time
	 * complexity of quicksort is O(n^2).
	 */

	public static void main(String[] args) {

		int[] arr = {123, 2, 4, 6, 1, 3};

		quicksort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void quicksort(int[] arr, int low, int high) {

		if (low < high) {

			int pivot = partition(arr, low, high);

			quicksort(arr, low, pivot - 1);
			quicksort(arr, pivot + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
