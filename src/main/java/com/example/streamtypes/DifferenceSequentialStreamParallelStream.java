package com.example.streamtypes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DifferenceSequentialStreamParallelStream {

	/*
	 * Streams are used to process data in a sequential manner on collections
	 * of objects. They are wrappers around data sources, allowing complex processing
	 * convenient and efficient.
	 *
	 * Streams DOES NOT store data, and in that sense, is not a data structure.
	 * Streams also does not change the original data, but rather provide the result
	 * of processing the data per pipelined methods.
	 */

	static class SequentialStreamExample {

		List<String> list = Arrays.asList("hello", "again",
				"v", "i", "c", "t", "o", "r");

	}

	public static void main(String[] args) {

		SequentialStreamExample sequentialStreamExample = new SequentialStreamExample();


		/*
		 * The sequential stream uses a single thread to process the pipelining.
		 * Any stream operation without explicitly specified "parallel" name is
		 * single threaded.
		 *
		 * Objects from sequencial streams are pipelined in a single stream on the same
		 * process, even if the underlying system supports multiple threads. Hence, it
		 * doesn't take advantage of multi-core systems.
		 */
		sequentialStreamExample.list.stream()
				.filter(s -> s.length() <= 1)
				.forEach(System.out :: println);

		sequentialStreamExample.list.stream()
				.filter(s -> s.length() > 1)
				.map(String :: toUpperCase)
				.sorted()
				.forEach(System.out :: println);

		/*
		 * The parallel stream uses multiple threads to process the pipelining, even
		 * if the whole program does not use multi-core processors.
		 *
		 * Using parallel streams, the data processing gets divided into multiple
		 * streams, which are processed on separete cores of the processor. The final
		 * result is the concatenation of all the streams.
		 *
		 * The order of the elements in the stream is not guaranteed. Like other
		 * parallel programs, they are complex and error-prone.
		 */

		sequentialStreamExample.list.parallelStream()
				.filter(s -> s.length() <= 1)
				.forEach(System.out :: println);

		sequentialStreamExample.list.parallelStream()
				.filter(s -> s.length() > 1)
				.map(String :: toUpperCase)
				.sorted()
				.forEach(System.out :: println);
	}
}
