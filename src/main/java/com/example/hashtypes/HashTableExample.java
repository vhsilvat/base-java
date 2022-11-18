package com.example.hashtypes;

import java.util.Hashtable;

public class HashTableExample {

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

	Hashtable<String, String> hashMap = new Hashtable<String, String>();
}
