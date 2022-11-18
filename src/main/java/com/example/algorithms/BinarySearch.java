package com.example.algorithms;

public class BinarySearch {

	/*
	 * The binary search algorithm is used to determine the position of a target
	 * value within a sorted array. This algorithm is based on the divide and
	 * conquer approach.
	 */

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int index = binarySearch(arr, 5);

		System.out.println("Index of 5 is: " + index);
	}

	public static int binarySearch(int[] arr, int key) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
