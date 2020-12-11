package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestArray {

	/*
	 * Using Arrays Sort
	 */
	public static int getSecondLargestArray(int[] a1, int total) {

	
		
		Arrays.sort(a1);
		return a1[total - 2];
		
	}

	/*
	 * using collections
	 */

	public static int getSecondLargestArrayUsingCollections(Integer[] b1, int total) {

		List<Integer> list = Arrays.asList(b1);

		  Collections.sort(list);
		

		int element = list.get(total - 2);
		return element;
	}

	public static void main(String[] args) {

		int a1[] = { 1, 2, 5, 6, 3, 2 };
		
		getSecondLargestArray(a1, 6);
		System.out.println("Second Largest:using Arrays sort: " + getSecondLargestArray(a1, 6));

		Integer b1[] = { 44, 66, 99, 33, 22, 55 };
		getSecondLargestArrayUsingCollections(b1, 6);
		System.out.println("Second Largest:using collection: " + getSecondLargestArrayUsingCollections(b1, 6));

	}

}
