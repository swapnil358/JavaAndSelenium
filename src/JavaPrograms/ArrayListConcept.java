package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListConcept {

	public static void main(String[] args) {

		int[] a = new int[3];    

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		System.out.println(a.length);

		System.out.println("************   String Array   **************************************************");

		ArrayList<String> arrStr = new ArrayList<String>(); 

		arrStr.add("swapnil");
		arrStr.add("triveni");
		arrStr.add("pappa");

		System.out.println("String Array size:" + " " + arrStr);

		System.out.println(arrStr.size());

		// to print the array

		for (int i = 0; i < arrStr.size(); i++) {
			System.out.println("printing array:" + " " + arrStr.get(i));
		}

		System.out.println("************  Integer Array   **************************************************");

		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(10);
		arrInt.add(20);
		arrInt.add(30);

		System.out.println("Integer Array size" + " " + arrInt.size());
		System.out.println(arrInt.get(2));

		// to print the array

		for (int i = 0; i < arrInt.size(); i++) {
			System.out.println("Printing array" + " " + arrInt.get(i));
		}

		System.out.println("************  HashMap   **************************************************");

		HashMap h = new HashMap();
		h.put(10, "A");
		h.put(20, "B");
		h.put(30, "C");

		System.out.println("hash map is  "+h.size());

	}

}
