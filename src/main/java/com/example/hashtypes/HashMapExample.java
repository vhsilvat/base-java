package com.example.hashtypes;

import java.util.HashMap;

public class HashMapExample {

	/*
	 * Hashmaps allow arbitrary objects to be associated with other arbitrary objects.
	 * This can be very useful for storing data in a structured way and for grouping
	 * similar objects together. It can also be used to store data in a sorted manner.
	 *
	 * Hashmaps
	 */

	/*
	 * The HashMap class is a hash table that implements the Map interface and
	 * inherits AbstractMap.
	 *
	 * It's non-synchronized, as a result, two or more threads can access the HashMap
	 * data at the same time.
	 *
	 * This is not thread-safe, so it can't be used in a multi-threaded environment
	 * without synchronization.
	 *
	 * In a hashmap there can be one null key and any number of null values.
	 *
	 * HashMap values are iterated by using an Iterator.
	 *
	 * Since HashMaps are unsyncronized, they are faster and use less memory than HashTables.
	 */

	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
}
