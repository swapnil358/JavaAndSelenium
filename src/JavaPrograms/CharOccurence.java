package JavaPrograms;

import java.util.HashMap;

public class CharOccurence {

	public static void Char(String InputString) {

		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();

		char[] str = InputString.toCharArray();

		for (char c : str) {
			if (counter.containsKey(c)) {
				counter.put(c, counter.get(c) + 1);
			} else
				counter.put(c, 1);
		}

		System.out.println(counter);

	}

	public static void main(String[] args) {

		Char("narayana");

	}

}
