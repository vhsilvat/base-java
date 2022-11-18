package com.example.hashtypes;

import java.util.HashMap;
import java.util.Hashtable;

public class DifferenceHashmapHashtable {

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
	HashMap<String, String> hashMap = new HashMap<String, String>();

	/*
	 * The HashMap class is a hash table that implements the Map interface and
	 * inherits Dictionary.
	 *
	 * It's synchronized, as a result, only one thread can access the Hashtable data at a time.
	 *
	 * It's thread-safe, so it can be used in a multi-threaded environment and can be
	 * shared among many threads.
	 *
	 * Hashtables do not allow null keys or null values.
	 *
	 * Hashtables values are iterated by using an Enumerator and Iterator.
	 *
	 * Since Hashtables are synchronized, they are slower and use more memory than HashMaps.
	 * But ut eliminates the need for extra code for synchronization.
	 */
	Hashtable<String, String> hashtable = new Hashtable<>();
}
