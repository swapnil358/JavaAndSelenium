package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class CharOccurenceAndCountDuplicate {

	public static void CharDupCount(String inputString) {

		HashMap<Character, Integer> CountBucket = new HashMap<Character, Integer>();

		char[] str = inputString.toCharArray();

		for (char c : str) {
			if (CountBucket.containsKey(c)) {
				CountBucket.put(c, CountBucket.get(c)+1);
			} else {
				CountBucket.put(c, 1);
			}
		}
		System.out.println(CountBucket);

		
		  Set<Character> SetString = CountBucket.keySet();
		  
		  System.out.println("Dup char: "+" " + inputString);
		  
		  for (Character s : SetString) {
		  
		  if (CountBucket.get(s) > 1) {
		  
		  System.out.println(s + " : " + CountBucket.get(s));
		  
		  }
		  
		  }
		 
	}

	public static void main(String[] args) {

		CharDupCount("maharajam");
	}

}
