package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		// composed of one or more intermediary operations
		// and only one terminal operation
		//
		// Intermediary operation: create new streams and only executes
		// when a terminal operation is invoked.
		// * filter();
		// * map();
		// * flatMap();
		// * peek();
		// * distinct();
		// * sorted();
		// * skip();
		// * limit(short-circuit);
		//
		// Terminal operation: create an non-stream object, and determines
		// the end of stream().
		// * forEach();
		// * forEachOrdered();
		// * toArray();
		// * reduce();
		// * collect();
		// * min();
		// * max();
		// * count();
		// * anyMatch(*);
		// * allMatch(*);
		// * noneMatch(*);
		// * findFirst(*);
		// * findAny(*);
		// (*) short-circuit;

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
