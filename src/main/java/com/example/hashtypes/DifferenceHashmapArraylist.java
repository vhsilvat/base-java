package com.example.hashtypes;

import java.util.ArrayList;
import java.util.HashMap;

public class DifferenceHashmapArraylist {

	/*
	 * Both of them are part of the Collection Framework, but how they store and process
	 * data is different.
	 */

	/*
	 * Arraylists implement the List interface and inherits AbstractList.
	 *
	 * They store elements values and maintains the indexes of the elements and the order
	 * of the elements. There can be only one value per index.
	 *
	 * It allows duplicate values in the array and can be used as a stack or a queue.
	 *
	 * ArrayLists also allows any number of null values.
	 *
	 * We can fetch the values of an arraylist by using the index of the element.
	 */
	ArrayList<String> arrayList = new ArrayList<>();

	/*
	 * Hashmaps implements the Map interface and inherits AbstractMap.
	 *
	 * They store elements in keys and values pairs. For each key, there can be only one
	 * value. Theres no guarantee on the order of the elements.
	 *
	 * Hashmaps allow duplicate values, but doesn't allow duplicate keys.
	 *
	 * It allows only one null key, but any number of null values.
	 *
	 * We can fetch the values of a hashmap by using the key of the element.
	 */
	HashMap<Integer, String> hashMap = new HashMap<>();
}
