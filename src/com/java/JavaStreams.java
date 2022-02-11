package com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	private static final IntConsumer Sysout = null;

	public static void main(String[] args) throws IOException {
		//1. Integer Stream
		/*
		 * IntStream 
		 * .range(1, 10)
		 *  .forEach(System.out::print);
		 *  System.out.println();
		 */
		
		//2. Integer Stream with skip
		/*
		 * IntStream 
		 * .range(1, 10)
		 *  .skip(5) 
		 *  .forEach(System.out::print);
		 * System.out.println();
		 */
		
		//3. Integer Stream with sum
		/*
		 * System.out.println(IntStream .range(1, 5)
		 *  .sum()); 
		 *  System.out.println();
		 */
		
		//4. Stream.of,sorted and findFirst
		/*
		 * Stream.of("Ava","Aneri","Alberto")
		 *  .sorted() 
		 *  .findFirst()
		 * .ifPresent(System.out::println);
		 */
		
		//5. Stream from Array,sort,filter and print
		/*
		 * String[] names={"Al","Ankit","Kushal","Brent","Sarika","Amanda","Hans","Shivika"};
		 * Arrays.stream(names) //same as Stream.of(names) 
		 * .filter(x->x.startsWith("S"))
		 * .sorted() 
		 * .forEach(System.out::println);
		 */
		
		//6. average of squares of an int array
		/*
		 * Arrays.stream(new int[] {2,4,6,8,10})
		 *  .map(x->x*x) 
		 *  .average()
		 * .ifPresent(System.out::println);
		 */
		
		//7. Steam from List,filter and print
		/*
		 * List<String> people=Arrays.asList("Al","Ankit","Sarika","amanda","Hans");
		 * people
		 *  .stream() 
		 *  .map(String::toUpperCase)
		 *   .filter(x->x.startsWith("A"))
		 * .forEach(System.out::println);
		 */
		
		//8. Stream rows from text file ,sort ,filter,and print and also throws exception
		/*
		 * Stream<String> bands=Files.lines(Paths.get("bands.txt"));
		 *  bands .sorted()
		 * .filter(x->x.length()>13)
		 *  .forEach(System.out::println);
		 *   bands.close();
		 */
		
		//9. Stream rows from text file and save to List
		List<String> bands2=Files.lines(Paths.get("bands.txt"))
				.filter(x->x.contains("jit"))
				.collect(Collectors.toList());
			bands2.forEach(x->System.out.println(x));
		
	}
}
