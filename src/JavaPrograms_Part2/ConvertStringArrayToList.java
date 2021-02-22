package JavaPrograms_Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import JavaPrograms.ConvertArrayToArrayList;

public class ConvertStringArrayToList {

	// 5) How to convert Array to ArrayList and ArrayList to Array?

	
	// Array to ArrayList: Arrays.asList()
	
	public static void main(String[] args) {

		String[] strArr = { "abc", "xyz", "java" };

		List<String> str = Arrays.asList(strArr);
		System.out.println(str);

	
		
		ArrayToArrayList();
	}
	
	

	// ArrayList to Array: toArray()
	
	public static void ArrayToArrayList() {

		ArrayList<String> ls = new ArrayList<>();

		ls.add("java");
		ls.add("python");
		ls.add("c#");

		Object[] s = ls.toArray();
		System.out.println(s);
	}

}
